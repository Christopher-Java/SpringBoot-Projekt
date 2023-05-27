package se.yrgo.Domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @ElementCollection
    private List<Actor> actors;
    @ElementCollection
    private List<Genre> genres;
    private String title;
    @ManyToOne
    private Director director;
    private int year;
    
    public Movie() {
    }
    
    public Movie(Long id, List<Actor> actors, List<Genre> genres, String title, Director director, int year) {
        this.id = id;
        this.actors = actors;
        this.genres = genres;
        this.title = title;
        this.director = director;
        this.year = year;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public List<Actor> getActors() {
        return actors;
    }
    
    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
    
    public List<Genre> getGenres() {
        return genres;
    }
    
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    @ManyToOne
    public Director getDirector() {
        return director;
    }
    
    public void setDirector(Director director) {
        this.director = director;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", actors=" + actors +
                ", genres=" + genres +
                ", title='" + title + '\'' +
                ", director=" + director +
                ", year=" + year +
                '}';
    }
}