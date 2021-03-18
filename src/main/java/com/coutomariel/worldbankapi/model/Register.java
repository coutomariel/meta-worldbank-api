package com.coutomariel.worldbankapi.model;

import lombok.Data;

@Data
public class Register {
    private Indicator indicator;
    private Country country;
    private String date;
    private String value;
}
