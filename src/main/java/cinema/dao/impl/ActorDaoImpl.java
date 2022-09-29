package cinema.dao.impl;

import java.util.Optional;
import cinema.dao.ActorDao;
import cinema.model.Actor;
import org.hibernate.SessionFactory;

public class ActorDaoImpl extends AbstractDao implements ActorDao {
    public ActorDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Actor add(Actor actor) {
        return null;
    }

    @Override
    public Optional<Actor> get(Long id) {
        return null;
    }
}
