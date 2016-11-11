package com.jacksonmix.android.aca.afinal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mixja on 11/9/16.
 */
public interface FantasyDataCall {

    //make API call in this class

    //put mlb key in 'api_key=' (already did)

    @GET("mlb/v2/JSON/Players")
    Call<List<Player>> getPlayerBio();


}
