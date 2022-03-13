package com.example.recyclerviewsearch;


import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppConfig {

    public static String BASE_URL = "https://restaurant.bdtask.com/demo/appv1/";

    public static Retrofit getRetrofit(Context context) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static Retrofit getRetrofit2(Context context) {
        return new Retrofit.Builder()
                .baseUrl("https://store.bdtask.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
