package com.company;

import java.time.LocalDate;


public class InfoCar {
    private LocalDate date;
    private String model;
    private int price;
    private String color;

    public InfoCar(){

    }

    public InfoCar(LocalDate date, String model, int price, String color) {
        this.date = date;
        this.model = model;
        this.price = price;
        this.color = color;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "InfoCar: " +
                "date: " + date + "\n" +
                "model: " + model  + "\n" +
                "price: " + price + "$" + "\n" +
                "color: " + color;
    }
}
