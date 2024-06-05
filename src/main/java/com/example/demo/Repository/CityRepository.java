package com.example.demo.Repository;

import com.example.demo.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    City findById(long id);
}
