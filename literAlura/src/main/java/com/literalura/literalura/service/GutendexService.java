package com.literalura.literalura.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GutendexService {
    private static final String BASE_URL = "https://gutendex.com/";

    public GutendexAPI createGutendexAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(GutendexAPI.class);
    }
}
