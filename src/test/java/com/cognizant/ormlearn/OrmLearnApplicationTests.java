package com.cognizant.ormlearn;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country.Country;
import com.cognizant.ormlearn.service.CountryService.CountryService;

@SpringBootTest
class OrmLearnApplicationTests {

	private static CountryService countryService;

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	@Test
	void contextLoads() {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class);

		countryService = context.getBean(CountryService.class);

		testGetAllCountries();
	}

	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> countries = countryService.getAllCountries();

		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");

	}

}
