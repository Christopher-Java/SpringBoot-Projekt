package se.yrgo.rest;

import se.yrgo.Domain.Genre;
import java.util.List;

public class GenreList {
        private List<Genre> genres;

        public GenreList() {}
        public GenreList(List<Genre> genres) {
            this.genres = genres;
        }

        public List<Genre> getGenres() {
            return genres;
        }

        public void setGenres(List<Genre> genres) {
            this.genres = genres;
        }
    }
