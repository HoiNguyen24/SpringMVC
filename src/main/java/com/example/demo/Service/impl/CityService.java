package com.example.demo.Service.impl;

import com.example.demo.Model.City;
import com.example.demo.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityService implements com.example.demo.Service.ICityService {
    @Autowired
    CityRepository cityRepository;
    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findById(Long id) {
        return cityRepository.findById(id.longValue());
    }

    @Override
    public void save(City city) {
          cityRepository.save(city);
    }

    @Override
    public void remove(Long id) {
         cityRepository.deleteById(id);
    }
}
