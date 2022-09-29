package cinema.service.impl;

import cinema.dao.ActorDao;
import cinema.model.Actor;
import cinema.service.ActorService;

public class ActorServiceImpl implements ActorService {
    private final ActorDao actorDao;

    public ActorServiceImpl(ActorDao actorDao) {
        this.actorDao = actorDao;
    }

    @Override
    public Actor add(Actor actor) {
        return actorDao.add(actor);
    }

    @Override
    public Actor get(Long id) {
        return actorDao.get(id).orElseThrow(()
                -> new RuntimeException("Can't get actor by id: " + id));
    }
}
