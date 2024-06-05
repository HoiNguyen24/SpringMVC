package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
