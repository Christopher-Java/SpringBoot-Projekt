package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import se.yrgo.Domain.Actor;
import se.yrgo.Domain.Movie;
import se.yrgo.data.ActorRepository;
import se.yrgo.data.MovieRepository;

import java.util.List;

public class MovieRestController {
    @Autowired
    private MovieRepository data;

    @RequestMapping("/Movie")
    public MovieList allMovies() {
        List<Movie> all = data.findAll();
        return new MovieList((Movie) all);
    }

    @RequestMapping("/Movie/{name}")
    public ResponseEntity showMovieByName(@PathVariable("name") String name) {
        Movie movie = data.findByName(name);
        return new ResponseEntity<Movie>(movie, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/Movie", method = RequestMethod.POST)
    public ResponseEntity createANewMovie(@RequestBody Movie movie) {
        data.save(movie);
        return new ResponseEntity<Movie>(movie, HttpStatus.CREATED);
    }
}