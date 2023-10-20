package com.example.casestudyfullstack.service;

import com.example.casestudyfullstack.model.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {
    List<Country> getAllCountries();

    Country getCountryById(Long id);

    void saveCountry(Country country);

    void updateCountry(Long id, Country country);

    void deleteCountry(Long id);
}