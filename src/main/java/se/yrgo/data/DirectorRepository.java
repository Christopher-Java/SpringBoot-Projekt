package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.yrgo.Domain.Director;
@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {
    public Director findbyName(String name);
}
