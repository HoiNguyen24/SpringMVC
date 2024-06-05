package com.example.demo.Controller;

import com.example.demo.Model.City;
import com.example.demo.Service.ICityService;
import com.example.demo.Service.impl.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
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
    public ModelAndView getAllCity(){
        List<City> cities = cityService.findAll();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject(cities);
        return modelAndView;
    }
    @GetMapping("/{id}")
    public ModelAndView getCityById(@PathVariable long id){
        City city = cityService.findById(id);
        ModelAndView modelAndView = new ModelAndView("city");
        modelAndView.addObject(city);
        return modelAndView;
    }
    @PostMapping("/add")
    public String addCity(@ModelAttribute City city){
        this.cityService.save(city);
        return "redirect:/cities";
    }
    @PostMapping("/remove/{id}")
    public String removeCity(@PathVariable long id){
        this.cityService.remove(id);
        return "redirect:/cities";
    }
    @PostMapping("/edit/{id}")
    public String editCity(@ModelAttribute City city,@PathVariable long id){
        city.setId(id);
        this.cityService.save(city);
        return "redirect:/cities";
    }
}
