package com.devDJ.semana13.Episodio;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AnimeApiService {
    @GET("anime/{animeId}/episodes")
    Call<EpisodeResponse> getEpisodes(@Path("animeId") int animeId);
}
