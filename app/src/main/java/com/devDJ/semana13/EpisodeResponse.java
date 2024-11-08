package com.devDJ.semana13.Episodio;

import java.util.List;

public class EpisodeResponse {
    private List<Episode> data;

    public EpisodeResponse() {
    }
    public EpisodeResponse(List<Episode> data) {
        this.data = data;
    }

    public List<Episode> getData() {
        return data;
    }

    public void setData(List<Episode> data) {
        this.data = data;
    }
}
