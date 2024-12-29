package com.example.vehicles;

public class Car {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Price: $" + price);
    }
}