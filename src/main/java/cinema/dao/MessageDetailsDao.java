package cinema.dao;

import cinema.model.MessageDetails;

public interface MessageDetailsDao {
    MessageDetails create(MessageDetails entity);

    MessageDetails get(Long id);
}
