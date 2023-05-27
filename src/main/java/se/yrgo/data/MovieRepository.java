package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.yrgo.Domain.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    public Movie findByName(String title);
}