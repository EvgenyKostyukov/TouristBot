package com.evgeny.spring.rest.service;

import com.evgeny.spring.rest.dao.CityDAO;
import com.evgeny.spring.rest.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDAO cityDAO;


    @Override
    @Transactional
    public List<City> getAllCities() {
        return cityDAO.getAllCities();
    }

    @Override
    @Transactional
    public void saveCities(City city) {
        cityDAO.saveCities(city);
    }

    @Override
    @Transactional
    public City getCity(int id) {
        return cityDAO.getCity(id);
    }

    @Override
    @Transactional
    public void deleteCity(int id) {
        cityDAO.deleteCity(id);

    }
}
