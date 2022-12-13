package com.example.a2_json.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.a2_json.api.PokemonApi;
import com.example.a2_json.model.Pokemon;
import com.example.a2_json.utils.NetworkUtils;

import java.util.ArrayList;
import java.util.List;


import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainActivityViewModel extends ViewModel
{

    /*
    public MutableLiveData<Pokemon> mutablePokemon;
    public MainActivityViewModel() {
        mutablePokemon = new MutableLiveData<>();
    }

    public void descarregaPokemon(int id) {
        Observable.fromCallable(() -> {
            Pokemon p = PokemonApi.getPokemon(id);
            mutablePokemon.postValue(p);
            return 1;
        }).subscribeOn(Schedulers.io()).subscribe();
    }
     */
    public MutableLiveData<List<Pokemon>> mutableListPokemons;

    public MainActivityViewModel() {
        mutableListPokemons = new MutableLiveData<>();
    }

    public void descarregaPokemons()
    {
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        Observable.fromCallable(() -> {
            for(int i = 1; i <= 20; i++)
            {
                Pokemon p = PokemonApi.getPokemon(i);
                pokemons.add(p);
            }
            mutableListPokemons.postValue(pokemons);
            return 1;
        }).subscribeOn(Schedulers.io()).subscribe();
    }
}
