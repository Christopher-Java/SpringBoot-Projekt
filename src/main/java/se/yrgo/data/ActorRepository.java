package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.yrgo.Domain.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    public Actor findByName(String name);
}
