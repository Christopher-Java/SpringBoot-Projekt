package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.yrgo.Domain.Genre;
import se.yrgo.data.GenreRepository;
import java.util.List;
@RestController
public class GenreRestController {
        @Autowired
        private GenreRepository data;

        @RequestMapping("/Genre")
        public GenreList allGenres() {
            List<Genre> all = data.findAll();
            return new GenreList(all);
        }
        @RequestMapping(value = "/Genre", method = RequestMethod.POST)
        public ResponseEntity createANewGenre(@RequestBody Genre genre) {
            data.save(genre);
            return new ResponseEntity<Genre>(genre, HttpStatus.CREATED);
        }
    }
