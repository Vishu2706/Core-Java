class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created.");
    }

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    Car() {
        super();
        System.out.println("Car is created.");
    }

    @Override
    void start() {
        super.start(); 
        System.out.println("Car is starting.");
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}