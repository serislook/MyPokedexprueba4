package pokedex.acevedo.octavio.mypokedex.pokeapi;

import pokedex.acevedo.octavio.mypokedex.models.PokemonAnswer;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by osx on 01-11-17.
 */

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonAnswer> getPokemonList(@Query("limit") int limit, @Query("offset") int offset);

}
