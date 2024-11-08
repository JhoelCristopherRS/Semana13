package com.devDJ.semana13;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.devDJ.semana13.network.AnimeRetrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AnimeAdapter animeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //referencia a nuestro resaicler
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        fetchDataFromApi();
    }

    /*private void fetchAnimeList() {
        Call<ApiResponse> call = animeApi.getAnimeList();
        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<Anime> animeList = response.body().getData();
                    for (Anime anime : animeList) {
                        Log.d("AnimeTitle", "Title: " + anime.getTitle());
                        Log.d("AnimeImage", "Image URL: " + anime.getImages().getJpg().getSmallImageUrl());
                        Log.d("AnimeEpisodes", "Episodes: " + anime.getEpisodes());
                    }
                } else {
                    Log.e("API Error", "Error en la respuesta de la API");
                }
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e("API Failure", t.getMessage());
            }
        });
    }*/

    private void fetchDataFromApi() {
        // Configurar Retrofit y realizar la solicitud a la API
        AnimeApi apiService = AnimeRetrofit.getRetrofitInstance().create(AnimeApi.class);
        Call<ApiResponse> call = apiService.getAnimeList();

        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                if (response.isSuccessful()) {
                    List<Anime> animeList = response.body().getData();
                    animeAdapter = new AnimeAdapter(animeList);
                    recyclerView.setAdapter(animeAdapter);
                }
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                // Manejar error
            }
        });
    }

}