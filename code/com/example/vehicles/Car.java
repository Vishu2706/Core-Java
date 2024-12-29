package com.example.vehicles;

public class Car {
    private String model;
    double price; // Default access
    protected String color;
    public String brand;

    public Car(String model, double price, String color, String brand) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    private void displayModel() {
        System.out.println("Model: " + model);
    }

    void displayPrice() { // Default access
        System.out.println("Price: $" + price);
    }

    protected void displayColor() {
        System.out.println("Color: " + color);
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    public void displayDetails() {
        displayModel();
        displayPrice();
        displayColor();
        displayBrand();
    }
}