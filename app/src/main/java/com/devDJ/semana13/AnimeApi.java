package com.devDJ.semana13;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AnimeApi {
    @GET("anime")  // Cambia esto por el path correcto de tu endpoint
    Call<ApiResponse> getAnimeList();
}
