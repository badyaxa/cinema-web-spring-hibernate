package cinema;

import cinema.dao.impl.ActorDaoImpl;
import cinema.dao.impl.CountryDaoImpl;
import cinema.dao.impl.MovieDaoImpl;
import cinema.model.Actor;
import cinema.model.Country;
import cinema.model.Movie;
import cinema.service.ActorService;
import cinema.service.CountryService;
import cinema.service.MovieService;
import cinema.service.impl.ActorServiceImpl;
import cinema.service.impl.CountryServiceImpl;
import cinema.service.impl.MovieServiceImpl;
import cinema.util.HibernateUtil;
import java.util.List;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        // use this session factory when you will initialize service instances
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Country usa = new Country("USA");
        CountryService countryService = new CountryServiceImpl(new CountryDaoImpl(sessionFactory));
        countryService.add(usa);

        Actor vinDiesel = new Actor("Vin Diesel");
        vinDiesel.setCountry(usa);
        ActorService actorService = new ActorServiceImpl(new ActorDaoImpl(sessionFactory));
        actorService.add(vinDiesel);

        Movie fastAndFurious = new Movie("Fast and Furious");
        fastAndFurious.setActors(List.of(vinDiesel));
        MovieService movieService = new MovieServiceImpl(new MovieDaoImpl(sessionFactory));
        movieService.add(fastAndFurious);
        System.out.println(movieService.get(fastAndFurious.getId()));
    }
}
