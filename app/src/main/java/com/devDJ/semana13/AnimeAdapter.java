package com.devDJ.semana13;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.devDJ.semana13.Episodio.episodiosActivity;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {

    private List<Anime> animeList;

    public AnimeAdapter(List<Anime> animeList) {
        this.animeList = animeList;
    }

    @Override
    public AnimeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime, parent, false);
        return new AnimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AnimeViewHolder holder, int position) {
        Anime anime = animeList.get(position);
        holder.titleAnime.setText(anime.getTitle());
        holder.episodesAnime.setText("Episodes: " + anime.getEpisodes());

        // Cargar imagen desde la URL usando una biblioteca como Glide o Picasso
        Glide.with(holder.itemView.getContext())
                .load(anime.getImages().getJpg().getSmallImageUrl())
                .into(holder.imageAnime);

        // Configurar OnClickListener para el botón "Ver episodios"
        holder.btn_episodios.setOnClickListener(v -> {
            // Obtener el ID del anime
            int animeId = anime.getMal_id();

            // Crear el Intent para ir a la actividad de episodios
            Intent intent = new Intent(holder.itemView.getContext(), episodiosActivity.class);
            intent.putExtra("ANIME_ID", animeId);

            // Iniciar la actividad
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }

    public static class AnimeViewHolder extends RecyclerView.ViewHolder {
        ImageView imageAnime;
        TextView titleAnime;
        TextView episodesAnime;
        Button btn_episodios;

        public AnimeViewHolder(View itemView) {
            super(itemView);
            imageAnime = itemView.findViewById(R.id.imageAnime);
            titleAnime = itemView.findViewById(R.id.titleAnime);
            episodesAnime = itemView.findViewById(R.id.episodesAnime);
            btn_episodios=itemView.findViewById(R.id.btn_epsodios);
        }
    }

}
