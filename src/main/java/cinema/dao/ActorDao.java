package cinema.dao;

import java.util.Optional;
import cinema.model.Actor;

public interface ActorDao {
    Actor add(Actor actor);

    Optional<Actor> get(Long id);
}
