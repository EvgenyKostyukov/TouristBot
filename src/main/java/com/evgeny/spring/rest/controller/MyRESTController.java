package com.evgeny.spring.rest.controller;

import com.evgeny.spring.rest.entity.City;
import com.evgeny.spring.rest.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private CityService cityService;

    @GetMapping( "/cities")
    public List<City> showAllCities(){
        List<City> allCities  = cityService.getAllCities();
        return  allCities;

    }

}
