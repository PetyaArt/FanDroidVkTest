package com.example.petya.fandroidvktest.rest.api;

import com.example.petya.fandroidvktest.rest.model.response.BaseItemResponse;
import com.example.petya.fandroidvktest.rest.model.response.Full;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WallApi {

    @GET(ApiMethods.WALL_GET)
    Call<Full<BaseItemResponse>> get(@Query("owner_id") String ownerId,

                                     @Query("access_token") String accessToken,

                                     @Query("extended") Integer extended,

                                     @Query("v") String version);
}
