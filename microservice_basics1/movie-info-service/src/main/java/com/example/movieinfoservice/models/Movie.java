package com.example.movieinfoservice.models;

public class Movie {
    private String movieId;
    private String name;
    private String summary;

    public Movie() {
    }


    public Movie(String movieId, String name, String summary) {
        this.movieId = movieId;
        this.name = name;
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
