class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started with key.");
    }
}

class Truck extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Truck engine started with button.");
    }
}

public class TransportTest {
    public static void main(String[] args) {
        Vehicle myCar = new Car();       // Polymorphism
        Vehicle myTruck = new Truck();   // Polymorphism

        myCar.startEngine();   // Calls Car's startEngine
        myTruck.startEngine(); // Calls Truck's startEngine
    }
}
