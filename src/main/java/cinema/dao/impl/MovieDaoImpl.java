package cinema.dao.impl;

import java.util.Optional;
import cinema.dao.MovieDao;
import cinema.model.Movie;
import org.hibernate.SessionFactory;

public class MovieDaoImpl extends AbstractDao implements MovieDao {
    public MovieDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Movie add(Movie movie) {
        return null;
    }

    @Override
    public Optional<Movie> get(Long id) {
        return null;
    }
}
