package com.example.demo.Controller;

import com.example.demo.Model.City;
import com.example.demo.Service.ICityService;
import com.example.demo.Service.impl.CityService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/cities")
public class CityController {
    @Autowired
    ICityService cityService;

    @GetMapping("")
    public ResponseEntity<List<City>> getAllCity(){
        List<City> cities = cityService.findAll();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable long id){
        City city = cityService.findById(id);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addCity(@ModelAttribute City city){
        this.cityService.save(city);
        return new ResponseEntity<>("OK",HttpStatus.OK);
    }
    @PostMapping("/remove/{id}")
    public ResponseEntity<String> removeCity(@PathVariable long id){
        this.cityService.remove(id);
        return new ResponseEntity<>("Deleted",HttpStatus.OK);
    }
    @PostMapping("/edit/{id}")
    public ResponseEntity<String> editCity(@ModelAttribute City city,@PathVariable long id){
        city.setId(id);
        this.cityService.save(city);
        return new ResponseEntity<>("edit",HttpStatus.OK);
    }
}
