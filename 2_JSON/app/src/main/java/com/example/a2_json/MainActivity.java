package com.example.a2_json;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.a2_json.adapter.PokemonAdapter;
import com.example.a2_json.model.Pokemon;
import com.example.a2_json.viewmodel.MainActivityViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcyPokemons;
    List<Pokemon> pokemons = new ArrayList<>();
    private static String json_url = "https://pokeapi.co/api/v2/pokemon/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcyPokemons = findViewById(R.id.rcyPokemons);
        rcyPokemons.setLayoutManager(new LinearLayoutManager(this));
        rcyPokemons.hasFixedSize();
        MainActivityViewModel viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        viewModel.descarregaPokemons();
        viewModel.mutableListPokemons.observe(this, new Observer<List<Pokemon>>() {
            @Override
            public void onChanged(List<Pokemon> lp) {
                for(Pokemon p : lp)
                {
                    PokemonAdapter adapter = new PokemonAdapter(lp);
                    rcyPokemons.setAdapter(adapter);
                }
            }
        });
    }
}