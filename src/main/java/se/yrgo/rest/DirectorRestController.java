package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.yrgo.Domain.Director;
import se.yrgo.data.DirectorRepository;

import java.util.List;
@RestController
public class DirectorRestController {
    @Autowired
    private DirectorRepository data;
    
    @RequestMapping("/Director")
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
