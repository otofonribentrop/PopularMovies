package com.example.tomovico.popularmovies;

public class Movie {

    // Data fields
    private int movieId;
    private String original_title;

    public Movie(int movieId, String original_title) {
        this.movieId = movieId;
        this.original_title = original_title;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }
}

