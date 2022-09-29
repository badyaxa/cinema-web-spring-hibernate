package cinema.dao.impl;

import java.util.Optional;
import cinema.dao.MovieDao;
import cinema.lib.Dao;
import cinema.model.Movie;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        return null;
    }

    @Override
    public Optional<Movie> get(Long id) {
        return Optional.empty();
    }
}
