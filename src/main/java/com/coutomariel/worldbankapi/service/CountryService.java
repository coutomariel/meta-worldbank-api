package com.coutomariel.worldbankapi.service;

import com.coutomariel.worldbankapi.model.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "http://api.worldbank.org/v2/country", name = "worldbank")
public interface CountryService {

    @GetMapping
    List<Country> getCountries(Pageable pegeable);
}