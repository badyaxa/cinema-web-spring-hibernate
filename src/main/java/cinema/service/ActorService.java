package cinema.service;

import cinema.model.Actor;

public interface ActorService {
    Actor add(Actor actor);

    Actor get(Long id);
}
