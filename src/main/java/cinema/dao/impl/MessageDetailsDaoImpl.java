package cinema.dao.impl;

import cinema.dao.MessageDetailsDao;
import cinema.model.MessageDetails;
import org.hibernate.SessionFactory;

public class MessageDetailsDaoImpl extends AbstractDao implements MessageDetailsDao {
    public MessageDetailsDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public MessageDetails create(MessageDetails entity) {
        return null;
    }

    @Override
    public MessageDetails get(Long id) {
        return null;
    }
}
