package me.afua.demo.repositories;


import me.afua.demo.models.Actor;
import me.afua.demo.models.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Long> {
    Iterable <Movie> findAllByCastIsIn(Iterable<Actor> actors);
}
