package com.coutomariel.worldbankapi.controller;

import com.coutomariel.worldbankapi.model.Register;
import com.coutomariel.worldbankapi.service.CountryService;
import com.coutomariel.worldbankapi.model.Country;
import com.coutomariel.worldbankapi.service.DataCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CoutryController implements CountryContract{

    @Autowired
    private CountryService service;

    @Autowired
    private DataCountryService dataCountryService;

    @Override
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Country> getCountry(Pageable pageable){
        return service.getCountries(pageable);
    }

    @Override
    @GetMapping("/{id}")
    public List<Register> getRegisters(@PathVariable("id") String id, Pageable pageable){
        return dataCountryService.getIndicatorsCountry(id, pageable);
    }


}
