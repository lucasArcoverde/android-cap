package com.example.lucasarcoverde.aula_13.endpoint;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lucasarcoverde on 17/01/2018.
 */

public class ApiClient {

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/posts";

    private static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static ApiInterface mApiService;

    private ApiClient() {

    }

    public static ApiInterface getInstance () {
        if (mApiService == null) {
            mApiService = retrofit.create(ApiInterface.class);
        }

        return mApiService;
    }
}

