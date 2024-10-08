package com.example.oneclass.apiClient;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCient {

    private static final String BASE_URL = "https://purbachal.emranhss.com/";
    private static Retrofit retrofit;

    public static Retrofit getRetrofit;
    public static Retrofit getRetrofit(){

        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;

    }
}
