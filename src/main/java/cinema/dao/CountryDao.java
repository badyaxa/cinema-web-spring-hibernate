package cinema.dao;

import cinema.model.Country;
import java.util.Optional;

public interface CountryDao {
    Country add(Country country);

    Optional<Country> get(Long id);
}
