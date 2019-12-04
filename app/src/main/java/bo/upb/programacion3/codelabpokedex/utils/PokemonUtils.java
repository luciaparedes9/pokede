package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class PokemonUtils {

    /**
     * Get list of pokemons
     *
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Pikachu", R.drawable.pikachu, "Electric"));
        pokemons.add(new Pokemon(2, "Bulbasaur", R.drawable.bulbasaur, "Grass"));
        pokemons.add(new Pokemon(3, "Charmander", R.drawable.charmander, "Fire"));
        pokemons.add(new Pokemon(4, "Squirtle", R.drawable.squirtle, "Water"));
        pokemons.add(new Pokemon(5, "Snorlax", R.drawable.snorlax, "Normal"));
        pokemons.add(new Pokemon(6, "ButterFree", R.drawable.butterfree, "Bug"));
        pokemons.add(new Pokemon(7, "Ekans", R.drawable.ekans, "Poison"));
        pokemons.add(new Pokemon(8, "Pidgey", R.drawable.pidgey, "Normal"));
        pokemons.add(new Pokemon(9, "Rattata", R.drawable.rattata, "Normal"));
        pokemons.add(new Pokemon(10, "Sandshrew", R.drawable.sandshrew, "Ground"));
        pokemons.add(new Pokemon(11, "Venonat", R.drawable.venonat, "Bug"));
        pokemons.add(new Pokemon(12, "Zubat", R.drawable.zubat, "Poison"));

        pokemons.add(new Pokemon(13, "Caterpie", R.drawable.caterpie, "Bug"));
        pokemons.add(new Pokemon(14, "Charizard", R.drawable.charizard, "Fire"));
        pokemons.add(new Pokemon(15, "Dragonite", R.drawable.dragonite, "Flying"));
        pokemons.add(new Pokemon(16, "Eevee", R.drawable.eevee, "Normal"));
        pokemons.add(new Pokemon(17, "Haunter", R.drawable.hunter, "Ghost"));
        pokemons.add(new Pokemon(18, "Jigglypuff", R.drawable.jiggly, "Normal"));
        pokemons.add(new Pokemon(19, "Psyduck", R.drawable.psyduck, "Water"));
        pokemons.add(new Pokemon(20, "Seviper", R.drawable.seviper, "Poison"));
        pokemons.add(new Pokemon(21, "Wobbuffet", R.drawable.wob, "Psychic"));
        pokemons.add(new Pokemon(22, "Wooloo", R.drawable.wooloo, "Normal"));

        return pokemons;
    }

    public static List<Pokemon> AshFavorites() {
        List<Pokemon> ashPokemon = new ArrayList<>();
        ashPokemon.add(new Pokemon(1, "Pikachu", R.drawable.pikachu, "Electric"));
        ashPokemon.add(new Pokemon(14, "Charizard", R.drawable.charizard, "Flying"));
        ashPokemon.add(new Pokemon(4, "Squirtle", R.drawable.squirtle, "Water"));
        return ashPokemon;
    }

    public static List<Pokemon> MistyFavorites() {
        List<Pokemon> mistyPokemon = new ArrayList<>();
        mistyPokemon.add(new Pokemon(19, "Psyduck", R.drawable.psyduck, "Water"));
        mistyPokemon.add(new Pokemon(16, "Eevee", R.drawable.eevee, "Normal"));
        mistyPokemon.add(new Pokemon(13, "Caterpie", R.drawable.caterpie, "Bug"));
        return mistyPokemon;
    }

    public static List<Pokemon> JessyFavorites() {
        List<Pokemon> jessyPokemon = new ArrayList<>();
        jessyPokemon.add(new Pokemon(20, "Seviper", R.drawable.seviper, "Poison"));
        jessyPokemon.add(new Pokemon(7, "Ekans", R.drawable.ekans, "Poison"));
        jessyPokemon.add(new Pokemon(21, "Wobbuffet", R.drawable.wob, "Psychic"));
        return jessyPokemon;
    }
}
