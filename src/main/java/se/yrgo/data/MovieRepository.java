package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.yrgo.Domain.Movies;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Long> {
    public Movies findByName(String title);
}