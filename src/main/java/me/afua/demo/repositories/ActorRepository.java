package me.afua.demo.repositories;


import me.afua.demo.models.Actor;
import me.afua.demo.models.Movie;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor,Long> {
    Iterable <Actor> findAllByRealnameContainingIgnoreCase(String s);
    Iterable <Actor> findAllByMoviesNotContaining(Movie thisMovie);
}
