package com.cognizant.ormlearn.service.CountryService;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.CountryRepository.CountryRepository;
import com.cognizant.ormlearn.model.Country.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepository;

	@Transactional
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}

	@Transactional
	public Country findCountryByCode(String code) throws CountryNotFoundException {
		Optional<Country> result = countryRepository.findById(code);

		if (!result.isPresent())
			throw new CountryNotFoundException("Not Found");

		Country resultedCountry = result.get();
		return resultedCountry;
	}

}
