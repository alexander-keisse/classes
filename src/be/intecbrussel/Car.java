package be.intecbrussel;

public class Car {

    // Instance members
    private String brand;
    private String model;
    private String color;

    // Class members
    private static final int NUMBER_OF_WHEELS = 4;

    // Constructors

    public Car() { // Default constructor

    }

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Instance methods
    public void accelerate() {
        System.out.println(brand + " " + model + "" + " is accelerating");
    }

    public void slowDown() {
        System.out.println("The car is slowing down");
    }

    public void turnLeft() {
        System.out.println("The car is turning left");
    }

    public void turnRight() {
        System.out.println("The car is turning right");
    }

    // Class method
    public static int getNumberOfWheels() {
        return NUMBER_OF_WHEELS;
    }
}
