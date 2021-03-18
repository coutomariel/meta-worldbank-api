package com.coutomariel.worldbankapi.service;

import com.coutomariel.worldbankapi.model.Register;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://api.worldbank.org/v2/country", name = "details")
public interface DataCountryService {

    @GetMapping("/{id}/indicator/SI.POV.DDAY")
    List<Register> getIndicatorsCountry(@PathVariable("id") String id, Pageable page);

}
