package cinema.service.impl;

import cinema.dao.MovieDao;
import cinema.lib.Inject;
import cinema.lib.Service;
import cinema.model.Movie;
import cinema.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return null;
    }

    @Override
    public Movie get(Long id) {
        return null;
    }
}