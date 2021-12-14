package javacore.F_staticmodifier.test;

import javacore.F_staticmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {

        // as a class atributte you dont need a instance object to access the property
        System.out.println(Car.getSpeedlimit());
        Car car1 = new Car("BMW", 270);
        Car car2 = new Car("Mercedes", 300);
        Car car3 = new Car("Audi", 285);

        // set the speedLimit to every instace objects that belongs the class car
        Car.setSpeedLimit(100);

        car1.print();
        car2.print();
        car3.print();
    }
}
