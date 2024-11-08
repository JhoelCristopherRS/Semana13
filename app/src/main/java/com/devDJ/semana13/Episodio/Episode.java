package com.devDJ.semana13.Episodio;

public class Episode {
    public int malId;
    public String title;
    public String aired;
    public double score;
    public boolean filler;
    public boolean recap;
    public String url;

    public Episode() {
    }

    public Episode(int malId, String title, String aired, double score, boolean filler, boolean recap, String url) {
        this.malId = malId;
        this.title = title;
        this.aired = aired;
        this.score = score;
        this.filler = filler;
        this.recap = recap;
        this.url = url;
    }

    public int getMalId() {
        return malId;
    }

    public void setMalId(int malId) {
        this.malId = malId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAired() {
        return aired;
    }

    public void setAired(String aired) {
        this.aired = aired;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    public boolean isRecap() {
        return recap;
    }

    public void setRecap(boolean recap) {
        this.recap = recap;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
