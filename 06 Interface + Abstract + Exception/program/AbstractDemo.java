
abstract class Vehicle {

    // Constructor
    Vehicle() {

        System.out.println("Vehicle Constructor Called");
    }

    // Abstract Method
    abstract void start();

    // Normal Method
    void stop() {

        System.out.println("Vehicle Stopped");
    }
}

// Child Class 1
class Car extends Vehicle {

    void start() {

        System.out.println("Car starts with key");
    }
}

// Child Class 2
class Bike extends Vehicle {

    void start() {

        System.out.println("Bike starts with self-start button");
    }
}

public class AbstractDemo {

    public static void main(String[] args) {

        Vehicle v;

        v = new Car();

        v.start();
        v.stop();

        System.out.println();

        v = new Bike();

        v.start();
        v.stop();
    }
}
