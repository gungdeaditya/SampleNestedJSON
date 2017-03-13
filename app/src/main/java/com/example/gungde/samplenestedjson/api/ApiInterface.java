package com.example.gungde.samplenestedjson.api;

import com.example.gungde.samplenestedjson.model.Contributor;
import com.example.gungde.samplenestedjson.model.geo.GeoExample;
import com.example.gungde.samplenestedjson.model.geo.Route;
import com.example.gungde.samplenestedjson.model.jsc.JscExample;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by gungde on 08/03/17.
 */

public interface ApiInterface {

    //@Path digunakan jika baseurl seperti https://api.github.com/repos/{owner}/{repo}/contributors
    //owner dan repo akan disesuaikan sesuai parameter yang diinput
    @GET("repos/{owner}/{repo}/contributors")
    Call<List<Contributor>> repoContributors(
            @Path("owner") String owner,
            @Path("repo") String repo);

    //@Query digunakan jika baseurl seperti https://maps.googleapis.com/maps/api/directions/json?origin=blabla ~~k
    //?origin untuk tipe parameter ini gunakan @Query
    @GET("json")
    Call<GeoExample> getMapsDetail(
            @Query("origin") String origin,
            @Query("destination") String destination,
            @Query("key") String key);


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    Retrofit retrofit2 = new Retrofit.Builder()
            .baseUrl("https://maps.googleapis.com/maps/api/directions/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
