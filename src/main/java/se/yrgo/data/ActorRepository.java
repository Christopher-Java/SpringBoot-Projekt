package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.yrgo.Domain.Actors;

@Repository
public interface ActorRepository extends JpaRepository<Actors, Long> {
    public Actors findByName(String name);
}
