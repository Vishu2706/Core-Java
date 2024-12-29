interface Engine {
    void startEngine();
}

interface Transmission {
    void changeGear(int gear);
}

class Car implements Engine, Transmission {
    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Gear changed to: " + gear);
    }
}

public class MultipleInterfacesCarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();  
        myCar.changeGear(3);  
    }
}