
// Base class
class Vehicle {
    // Method to start the engine
    public void startEngine() {
        System.out.println("Starting the vehicle's engine.");
    }

    // Method to stop the engine
    public void stopEngine() {
        System.out.println("Stopping the vehicle's engine.");
    }
}

// Subclass Car
class Car extends Vehicle {
    // Overriding the startEngine() method
    @Override
    public void startEngine() {
        System.out.println("Turning the key to start the car engine.");
    }

    // Overriding the stopEngine() method
    @Override
    public void stopEngine() {
        System.out.println("Turning the key to stop the car engine.");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    // Overriding the startEngine() method
    @Override
    public void startEngine() {
        System.out.println("Pressing the button to start the motorcycle engine.");
    }

    // Overriding the stopEngine() method
    @Override
    public void stopEngine() {
        System.out.println("Pressing the button to stop the motorcycle engine.");
    }
}

// Main class to test the functionality
public class VehicleDemo {
    public static void main(String[] args) {
        // Create instances of each subclass
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        // Start and stop the engines for each vehicle
        car.startEngine();
        car.stopEngine();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
