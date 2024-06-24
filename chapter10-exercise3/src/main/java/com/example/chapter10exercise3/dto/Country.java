package com.example.chapter10exercise3.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Country {
    private String name;
    private int population;

    private Country() {}

    public static Country of(String name, int population) {
        var country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }
}
