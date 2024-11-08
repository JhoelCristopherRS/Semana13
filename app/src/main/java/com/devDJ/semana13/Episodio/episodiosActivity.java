package com.devDJ.semana13.Episodio;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.devDJ.semana13.R;

public class episodiosActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EpisodeAdapter adapter;
    private int animeId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_episodios);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Obtener el ID del anime desde el Intent
        animeId = getIntent().getIntExtra("ANIME_ID", -1);
    }
}