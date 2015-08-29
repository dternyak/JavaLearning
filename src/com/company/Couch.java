package com.company;

/**
 * Created by danielternyak2 on 8/29/15.
 */
public class Couch {
    private String brand;
    private String color;
    private int seats;

    public int getSeats() {
        return seats;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Couch(String brand, String color, int seats) {

        this.brand = brand;
        this.color = color;
        this.seats = seats;
    }
}
