package com.example.a2_json;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a2_json.adapter.PokemonAdapter;
import com.example.a2_json.api.PokemonApi;
import com.example.a2_json.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcyPokemons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcyPokemons = findViewById(R.id.rcyPokemons);
        rcyPokemons.setLayoutManager(new LinearLayoutManager(this));
        rcyPokemons.hasFixedSize();
        List<Pokemon> pokemons = new ArrayList<>();

        //Pokemon p = PokemonApi.getPokemon(1);
        //pokemons.add(p);

        PokemonAdapter adapter = new PokemonAdapter(pokemons);
        rcyPokemons.setAdapter(adapter);
    }
}