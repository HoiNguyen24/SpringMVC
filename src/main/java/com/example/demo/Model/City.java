package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class City {
    @Id
    private Long id;
    private String name;
    private double dientich;
    private long danso;
    private double GDP;
    @ManyToOne
    private City city;
    private String mota;
    public City() {
    }
}
