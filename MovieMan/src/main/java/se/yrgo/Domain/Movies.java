package se.yrgo.Domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movies {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @ElementCollection
    private List<Actors> actors;
    @ElementCollection
    private List<Genres> genres;
    private String title;
    @ManyToOne
    private Director director;
    private int year;
    
    public Movies() {
    }
    
    public Movies(Long id, List<Actors> actors, List<Genres> genres, String title, Director director, int year) {
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
    
    public List<Actors> getActors() {
        return actors;
    }
    
    public void setActors(List<Actors> actors) {
        this.actors = actors;
    }
    
    public List<Genres> getGenres() {
        return genres;
    }
    
    public void setGenres(List<Genres> genres) {
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
        return "Movies{" +
                "id=" + id +
                ", actors=" + actors +
                ", genres=" + genres +
                ", title='" + title + '\'' +
                ", director=" + director +
                ", year=" + year +
                '}';
    }
}
