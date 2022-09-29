package cinema.service.impl;

import cinema.dao.CountryDao;
import cinema.model.Country;
import cinema.service.CountryService;

public class CountryServiceImpl implements CountryService {
    private final CountryDao countryDao;

    public CountryServiceImpl(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    @Override
    public Country add(Country country) {
        return countryDao.add(country);
    }

    @Override
    public Country get(Long id) {
        return countryDao.get(id).orElseThrow(()
                -> new RuntimeException("Can't get country by id: " + id));
    }
}
