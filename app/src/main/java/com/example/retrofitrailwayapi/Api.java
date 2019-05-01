package com.example.retrofitrailwayapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface Api {
    @GET("name-number/train/{city_name}/apikey/0sqlgye8de/")
    Call<TrainNameNoModel> getList(@Path(value = "city_name",encoded=true) String city);


    @GET("route/train/{route}/apikey/0sqlgye8de/")
    Call<RouteModel> getRoute(@Path(value ="route",encoded = true) int route);
}
