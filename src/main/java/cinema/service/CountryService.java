package cinema.service;

import cinema.model.Country;

public interface CountryService {
    Country add(Country country);

    Country get(Long id);
}
