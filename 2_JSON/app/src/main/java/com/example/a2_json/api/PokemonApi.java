package com.example.a2_json.api;

import android.util.Log;

import com.example.a2_json.model.Pokemon;
import com.example.a2_json.utils.NetworkUtils;

import org.json.JSONException;
import org.json.JSONObject;

public class PokemonApi {
    public static Pokemon getPokemon(int id)
    {
        Pokemon p = null;
        String json = NetworkUtils.getJSon("https://pokeapi.co/api/v2/pokemon/"+id);
        try {
            JSONObject pokemonObj = new JSONObject(json);
            String name = pokemonObj.getString("name");
            String desc = "Downloaded from JSON";
            JSONObject spritesObj = pokemonObj.getJSONObject("sprites");
            String imageURL = spritesObj.getString("front_default");
            p = new Pokemon(id, name, desc, imageURL);
        } catch (JSONException e) {
            Log.e("Error", "Error en generar pokemon");
        }
        return p;
    }
}
