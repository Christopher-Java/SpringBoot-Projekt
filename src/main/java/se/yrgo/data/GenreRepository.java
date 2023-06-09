package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.yrgo.Domain.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
    public Genre findByCategory(String category);
}