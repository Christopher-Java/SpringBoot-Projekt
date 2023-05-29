package se.yrgo.rest;

import se.yrgo.Domain.Director;

import java.util.List;

public class DirectorList {
    private List<Director> directors;
    
    public DirectorList() {
    }
    
    public DirectorList(List<Director> directors) {
        this.directors = directors;
    }
    
    public List<Director> getDirector() {
        return directors;
    }
    
    public void setDirector(List<Director> directors) {
        this.directors = directors;
    }
}