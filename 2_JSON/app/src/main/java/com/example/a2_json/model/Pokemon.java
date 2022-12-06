package com.example.a2_json.model;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    int id;
    String name;
    String desc;
    String imageURL;

    private static ArrayList<Pokemon> _pokemons;

    public static List<Pokemon> getPokemons() {
        if (_pokemons == null) {
            _pokemons = new ArrayList<>();
            _pokemons.add(new Pokemon(1, "Bulbasur", "Downloaded from singleton", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png"));
            _pokemons.add(new Pokemon(2, "Ivysaur", "Downloaded from singleton", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/2.png"));
            _pokemons.add(new Pokemon(10, "Caterpie", "Downloaded from singleton", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10.png"));
        }
        return _pokemons;
    }

    public Pokemon(int id, String name, String desc, String imageURL) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.imageURL = imageURL;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}

