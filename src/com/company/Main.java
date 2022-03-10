package com.company;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        HashMap<Car, InfoCar> map = new HashMap<>();
        map.put(new Car("07KG", "007AKE"), new InfoCar(LocalDate.of(2021, 3, 10), "Maybach-500", 100000, "black"));
        map.put(new Car("O7KG", "007JAF"), new InfoCar(LocalDate.of(2021, 5, 13), "PORSCHE TAYCAN", 120000, "Мокрый асвальт"));
        for (Map.Entry<Car, InfoCar> entry : map.entrySet()) {
            System.out.println(entry.getKey() +  " " + entry.getValue());
        }
    }
}
