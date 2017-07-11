package com.example.anamika.storeandsend.rest;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Anamika on 11-Jul-17.
 */

public interface ApiInterface {
    @GET("/sgm_android/WebService.asmx/insertfolochist")
    Call<List<Response>> sendGpsData
            (@Query("lat") String latitude,
             @Query("lon") String longitude,
             @Query("imei") String imei,
             @Query("battery") String battery,
             @Query("date_time") String dateTime,
             @Query("Accurate") String accurate,
             @Query("Panic") String panic,
             @Query("Speed") String speed,
             @Query("location") String location,
             @Query("Direction") String direction);

    @GET("/sgm_android/WebService.asmx/fologin")
    Call<List<Response>> sendLoginCredential
            (@Query("fo_id") String fo_id,
             @Query("pwd") String pwd,
             @Query("imei") String imei);
}
