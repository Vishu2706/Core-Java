package com.example.vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Car myCar = new Car("Model X", 89999.99, "Blue", "Tesla");

        System.out.println("Brand: " + myCar.brand);
        System.out.println("Color: " + myCar.color);
        System.out.println("Price: " + myCar.price);
            
        // System.out.println("Model: " + myCar.model); 
        
        myCar.displayBrand(); 
        myCar.displayColor(); 
        myCar.displayPrice(); 
        // myCar.displayModel(); 

        myCar.displayDetails();
    }
}