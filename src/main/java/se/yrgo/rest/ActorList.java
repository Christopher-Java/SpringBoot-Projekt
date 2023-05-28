package se.yrgo.rest;

import se.yrgo.Domain.Actor;

import java.util.List;

public class ActorList {
    private List<Actor> actors;
    
    public ActorList() {
    }
    
    public ActorList(List<Actor> actors) {
        this.actors = actors;
    }
    
    public List<Actor> getActors() {
        return actors;
    }
    
    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
