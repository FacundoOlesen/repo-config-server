package com.circuitbreaker.hotelsservice.service;

import com.circuitbreaker.hotelsservice.model.Hotel;

import java.util.List;

public interface IHotelService {
    List<Hotel> getHotelsByCityId(Long city_id);
}
