package com.coutomariel.worldbankapi.controller;

import com.coutomariel.worldbankapi.model.Country;
import com.coutomariel.worldbankapi.model.Register;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CountryContract {

    @ApiOperation(value = "Busca países", notes = "Realiza consulta paginada dos países disponíveis para pesquisa.")
    List<Country> getCountry(Pageable pageable);

    @ApiOperation(value = "Busca indicadores", notes = "Realiza consulta paginada dos dados históricos dos indicadores de um país a partir de seu ID")
    List<Register> getRegisters(@PathVariable("id") String id, Pageable pageable);


}
