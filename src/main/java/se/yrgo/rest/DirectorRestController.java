package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import se.yrgo.Domain.Director;
import se.yrgo.Domain.Movie;
import se.yrgo.data.DirectorRepository;
import se.yrgo.data.MovieRepository;

import java.util.List;

public class DirectorRestController {
    @Autowired
    private DirectorRepository data;
    
    @RequestMapping("/Movie")
    public DirectorList allDirectors() {
        List<Director> all = data.findAll();
        return new DirectorList(all);
    }
    
    @RequestMapping("/Director/{name}")
    public ResponseEntity showMovieByName(@PathVariable("name") String name) {
        Director director = data.findByName(name);
        return new ResponseEntity<Director>(director, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/Director", method = RequestMethod.POST)
    public ResponseEntity createANewDirector(@RequestBody Director director) {
        data.save(director);
        return new ResponseEntity<Director>(director, HttpStatus.CREATED);
    }
}
