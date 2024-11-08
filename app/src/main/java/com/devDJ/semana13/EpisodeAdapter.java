package com.devDJ.semana13.Episodio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.devDJ.semana13.R;

import java.util.List;

public class EpisodeAdapter extends RecyclerView.Adapter<EpisodeAdapter.EpisodeViewHolder> {

    private List<Episode> episodes;

    public EpisodeAdapter(List<Episode> episodes) {
        this.episodes = episodes;
    }

    @Override
    public EpisodeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.episode_item, parent, false);
        return new EpisodeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EpisodeViewHolder holder, int position) {
        Episode episode = episodes.get(position);
        holder.bind(episode);
    }

    @Override
    public int getItemCount() {
        return episodes.size();
    }

    public class EpisodeViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTextView;
        private TextView airedTextView;

        public EpisodeViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.episodeTitle);
            airedTextView = itemView.findViewById(R.id.episodeAired);
        }

        public void bind(Episode episode) {
            titleTextView.setText(episode.getTitle());
            airedTextView.setText("Aired: " + episode.getAired());
        }
    }
}
