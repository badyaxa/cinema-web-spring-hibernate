package cinema;

import cinema.lib.Injector;
import cinema.model.Movie;
import cinema.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Spy");
        movie.setDescription("Susan Cooper is a 40-year-old, single, "
                + "desk-bound CIA employee who assists her partner remotely, "
                + "field agent Bradley Fine, on a mission. "
                + "Fine accidentally kills arms dealer Tihomir Boyanov, "
                + "failing to learn the location of a suitcase nuke from him.");
        Movie spy = movieService.add(movie);
        System.out.println("movieService.get(spy.getId()) = " + movieService.get(spy.getId()));
    }
}
