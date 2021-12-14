package javacore.F_staticmodifier.domain;

public class Car {
    private String name;
    private double maxSpeed;
    // the static keyword makes the atributte a "class atributte" so its the same to every class instance
    private static double speedLimit = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    public void print() {
        System.out.println("---------------------------");
        System.out.println("Name: "+this.name);
        System.out.println("Max speed: "+this.maxSpeed);
        // to access the class variable have to use the properlly Class name
        System.out.println("Speed limit: "+Car.speedLimit);
    }


    // static methods: normally used to get and set static parameters, same rules of static variables
    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }

    public static double getSpeedlimit() {

        return Car.speedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

}
