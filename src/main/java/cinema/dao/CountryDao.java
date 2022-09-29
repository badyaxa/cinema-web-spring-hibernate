package cinema.dao;

import java.util.Optional;
import cinema.model.Country;

public interface CountryDao {
    Country add(Country country);

    Optional<Country> get(Long id);
}
