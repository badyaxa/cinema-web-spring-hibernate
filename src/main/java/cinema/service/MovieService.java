package cinema.service;

import cinema.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}
