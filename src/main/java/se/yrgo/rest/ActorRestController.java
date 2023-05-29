package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.yrgo.Domain.Actor;
import se.yrgo.data.ActorRepository;

import java.util.List;

@RestController
public class ActorRestController {
    @Autowired
    private ActorRepository data;
    
    @RequestMapping("/Actor")
    public ActorList allActors() {
        List<Actor> all = data.findAll();
        return new ActorList(all);
    }
    
    @RequestMapping("/Actor/{name}")
    public ResponseEntity showActorByName(@PathVariable("name") String name) {
        Actor actor = data.findByName(name);
        return new ResponseEntity<Actor>(actor, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/Actor", method = RequestMethod.POST)
    public ResponseEntity createANewActor(@RequestBody Actor actor) {
        data.save(actor);
        return new ResponseEntity<Actor>(actor, HttpStatus.CREATED);
    }
}

