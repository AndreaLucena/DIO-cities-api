package com.github.andreaalves.citiesapi.repository;

import com.github.andreaalves.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
