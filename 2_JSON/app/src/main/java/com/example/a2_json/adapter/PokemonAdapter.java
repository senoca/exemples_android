package com.example.a2_json.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a2_json.R;
import com.example.a2_json.model.Pokemon;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.ViewHolder> {
    private List<Pokemon> pokemons;

    public PokemonAdapter(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewFila = LayoutInflater.from(parent.getContext()).inflate(R.layout.fila_pokemon, parent, false);
        return new ViewHolder(viewFila);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pokemon actual = pokemons.get(position);
        holder.txvNamePokemon.setText(actual.getName() + "");
        holder.txvDescPokemon.setText(actual.getDesc() + "");


    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txvNamePokemon;
        TextView txvDescPokemon;
        ImageView imgvImgPokemon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txvNamePokemon = itemView.findViewById(R.id.txvNamePokemon);
            txvDescPokemon = itemView.findViewById(R.id.txvDescPokemon);
            //imgvImgPokemon = itemView.findViewById(R.id.imgvImgPokemon);
        }
    }
}
