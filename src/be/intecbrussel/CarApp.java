package be.intecbrussel;

public class CarApp {

    public static void main(String[] args) {

        Car tesla = new Car("Tesla", "X", "Black");

        System.out.println("Brand is: " + tesla.getBrand());
        System.out.println("Model is: " + tesla.getModel());
        System.out.println("Color is: " + tesla.getColor());

        System.out.println("A car has " + Car.getNumberOfWheels() + " wheels.");

        tesla.accelerate();
        tesla.turnLeft();
        tesla.turnRight();
        tesla.slowDown();

        Car bmw = new Car();

        bmw.setBrand("BMW");
        bmw.setModel("M4");
        bmw.setColor("White");

        System.out.println("Brand is: " + bmw.getBrand());
        System.out.println("Model is: " + bmw.getModel());
        System.out.println("Color is: " + bmw.getColor());

        bmw.accelerate();
    }
}
