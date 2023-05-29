package se.yrgo.rest;

import se.yrgo.Domain.Movie;


public class MovieList {
    private Movie movies;

    public MovieList() {
    }

    public MovieList(Movie movies) {
        this.movies = movies;
    }

    public Movie getMovies() {
        return movies;
    }

    public void setActors(Movie movies) {
        this.movies = movies;
    }
}