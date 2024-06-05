package com.example.demo.Model;

public class City {
    private long id;
    private String name;
    private double dientich;
    private long danso;
    private double GDP;

    private String mota;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public long getDanso() {
        return danso;
    }

    public void setDanso(long danso) {
        this.danso = danso;
    }

    public double getGDP() {
        return GDP;
    }

    public void setGDP(double GDP) {
        this.GDP = GDP;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public City(long id, String name, double dientich, long danso, double GDP, String mota) {
        this.id = id;
        this.name = name;
        this.dientich = dientich;
        this.danso = danso;
        this.GDP = GDP;
        this.mota = mota;
    }
}
