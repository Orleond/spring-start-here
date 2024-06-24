package com.example.chapter10exercise3.controller;

import com.example.chapter10exercise3.dto.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public Country france() {
        return Country.of("France", 67);
    }

    @GetMapping("/all")
    public List<Country> countries() {
        var c1 = Country.of("France", 67);
        var c2 = Country.of("Spain", 47);
        return List.of(c1, c2);
    }
}
