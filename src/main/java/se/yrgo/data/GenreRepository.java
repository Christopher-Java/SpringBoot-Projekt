package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.yrgo.Domain.Genres;

@Repository
public interface GenreRepository extends JpaRepository<Genres, Long> {
    public Genres findByName(String category);
}