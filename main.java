package lAB4;

class Vehicle {
    protected String make;
    protected String model;
    
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    public void drive() {
        System.out.println("Driving ");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    
    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }
    
    public void honk() {
        System.out.println("Honking");
    }
    
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}

class Motorcycle extends Vehicle {
    private int numberOfWheels;
    
    public Motorcycle(String make, String model, int numberOfWheels) {
        super(make, model);
        this.numberOfWheels = numberOfWheels;
    }
    
    public void revEngine() {
        System.out.println("Revving");
    }
    
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}

public class main {
    public static void main(String[] args) {
       Car c1 = new Car("Toyota", "Camry", 4);
       c1.drive();
       c1.honk();
       System.out.println("Toyoto Camry with " + c1.getNumberOfDoors() + " doors");
        
        Motorcycle m1 = new Motorcycle("Harley-Davidson", "Sportster", 2);
        m1.drive();
        m1.revEngine();
        System.out.println("Harley-Davidson Sportster with " + m1.getNumberOfWheels() +" wheels");
    }
}