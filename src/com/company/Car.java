package com.company;


public class Car {
    private String id;
    private String numberAuto;

    public Car() {
    }

    public Car(String id, String numberAuto) {
        this.id = id;
        this.numberAuto = numberAuto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(String numberAuto) {
        this.numberAuto = numberAuto;
    }

    @Override
    public String toString() {
        return "Key: " + "id: " + id + "\n" +
                "numberAuto: " + numberAuto;
    }
}
