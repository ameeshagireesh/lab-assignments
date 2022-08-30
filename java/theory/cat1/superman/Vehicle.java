package superman;

public class Vehicle {
    int maxSpeed = 120;

    // public void vroom() {
    // System.out.println("Vroom vroom");
    // }

    Vehicle() {
        System.out.println("Vehicle Constructor");
    }

    Vehicle(int maxSpeed) {
        System.out.println("Vehicle Constructor with speed");
        this.maxSpeed = maxSpeed;
    }
}

class Car extends Vehicle {
    int maxSpeed = 100;

    // public void display() {
    // System.out.println(super.maxSpeed);
    // }

    // public void vroom() {
    // super.vroom();
    // // System.out.println("Skrrt skrrt");
    // }

    Car() {
        super();
        System.out.println("Car Constructor");
    }
}