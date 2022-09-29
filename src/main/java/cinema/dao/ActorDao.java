package cinema.dao;

import cinema.model.Actor;
import java.util.Optional;

public interface ActorDao {
    Actor add(Actor actor);

    Optional<Actor> get(Long id);
}
