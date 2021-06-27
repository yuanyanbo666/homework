package com.swufe.javaee.beerV1.model;

import java.util.ArrayList;
import java.util.List;

public class Beer {
    private String band;
    private double size;

    public Beer(String band, double size) {
        this.band = band;
        this.size = size;
    }
    public Beer(){

    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "band='" + band + '\'' +
                ", size=" + size +
                '}';
    }

    public List<Beer> getBrands(String color) {
        List<Beer> brands = new ArrayList<>();
        if (color.equals("amber")) {
            Beer a=new Beer("Jack Amber",100);
            Beer b=new Beer("Red Moose",100);
            brands.add(a);
            brands.add(b);
        } else {
            Beer a=new Beer("Jali Pale Ale",100);
            Beer b=new Beer("Gout Stout",100);
            brands.add(a);
            brands.add(b);
        }
        return brands;
    }
}

