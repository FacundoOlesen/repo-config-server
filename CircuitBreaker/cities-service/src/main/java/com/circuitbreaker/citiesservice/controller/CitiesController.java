package com.circuitbreaker.citiesservice.controller;

import com.circuitbreaker.citiesservice.dto.CityDTO;
import com.circuitbreaker.citiesservice.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CitiesController {
    @Autowired
    private ICityService cityServ;

    @GetMapping("/hotels")
    public CityDTO getCityAndHotels(@RequestParam String name, @RequestParam String country) throws IllegalAccessException {
        return cityServ.getCitiesHotels(name, country);
    }
}
