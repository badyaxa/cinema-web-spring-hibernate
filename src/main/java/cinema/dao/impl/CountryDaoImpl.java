package cinema.dao.impl;

import java.util.Optional;
import cinema.dao.CountryDao;
import cinema.model.Country;
import org.hibernate.SessionFactory;

public class CountryDaoImpl extends AbstractDao implements CountryDao {
    public CountryDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Country add(Country country) {
        return null;
    }

    @Override
    public Optional<Country> get(Long id) {
        return null;
    }
}
