package com.circuitbreaker.citiesservice.service;

import com.circuitbreaker.citiesservice.dto.CityDTO;

public interface ICityService {
    public CityDTO getCitiesHotels(String name, String country) throws IllegalAccessException;
}
