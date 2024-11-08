package com.devDJ.semana13;


public class Anime {
    private int mal_id;
    private String title;
    private int episodes;
    private Images images;

    public Anime() {
    }

    public Anime(int mal_id, String title, int episodes, Images images) {
        this.mal_id = mal_id;
        this.title = title;
        this.episodes = episodes;
        this.images = images;
    }



    public int getMal_id() {
        return mal_id;
    }

    public void setMal_id(int mal_id) {
        this.mal_id = mal_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }
}
