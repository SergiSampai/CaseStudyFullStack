package com.example.casestudyfullstack.service;

import com.example.casestudyfullstack.model.Country;
import com.example.casestudyfullstack.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country getCountryById(Long id) {
        return countryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Country not found with id: " + id));
    }

    @Override
    public void saveCountry(Country country) {
        countryRepository.save(country);
    }

    @Override
    public void updateCountry(Long id, Country updatedCountry) {
        Country existingCountry = getCountryById(id);

        existingCountry.setName(updatedCountry.getName());

        countryRepository.save(existingCountry);
    }

    @Override
    public void deleteCountry(Long id) {
        Country existingCountry = getCountryById(id);
        countryRepository.delete(existingCountry);
    }
}