interface PaymentGateway {
    void processPayment(double amount);
}

class Car implements PaymentGateway {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public void processPayment(double amount) {
        if (amount >= price) {
            System.out.println("Payment of $" + amount + " processed for " + model + ".");
        } else {
            System.out.println("Insufficient payment. $" + amount + " is not enough for " + model + ".");
        }
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Price: $" + price);
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model S", 79999.99);
        myCar.displayDetails();
        myCar.processPayment(80000.00); 
        myCar.processPayment(50000.00); 
    }
}