package com.devDJ.semana13.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EpisodioRetrofit {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://api.jikan.moe/v4/anime/";  // Cambia esto por la URL base correcta

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
