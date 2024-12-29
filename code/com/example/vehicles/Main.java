package com.example.main;

import com.example.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Model S", 79999.99, "Red", "Tesla");

        // Accessing public member
        System.out.println("Brand: " + myCar.brand);

        // Accessing protected member
        // System.out.println("Color: " + myCar.color); // Error: color has protected access

        // Accessing default member
        // System.out.println("Price: " + myCar.price); // Error: price has default access

        // Accessing private member
        // System.out.println("Model: " + myCar.model); // Error: model has private access

        // Accessing methods
        myCar.displayBrand(); // Public method
        // myCar.displayColor(); // Error: displayColor() has protected access
        // myCar.displayPrice(); // Error: displayPrice() has default access
        // myCar.displayModel(); // Error: displayModel() has private access

        // Display all details using a public method
        myCar.displayDetails();
    }
}