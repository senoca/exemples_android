package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.adapter.PokemonAdapter;
import com.example.recyclerview.model.Pokemon;

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
        List<Pokemon> pokemons = Pokemon.getPokemons();
        PokemonAdapter adapter = new PokemonAdapter(pokemons);
        rcyPokemons.setAdapter(adapter);
    }
}