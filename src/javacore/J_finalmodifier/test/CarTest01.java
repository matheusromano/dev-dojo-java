package javacore.J_finalmodifier.test;

import javacore.J_finalmodifier.domain.Car;
import javacore.J_finalmodifier.domain.Jeep;
import javacore.J_finalmodifier.domain.Seller;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        // instaciation the subclass
        Jeep jeep = new Jeep();

        // car.MAX_SPEED : its is an error because the var is static
        // Car.MAX_SPEED = 158; : now we call in the right way but the the value couldnt be changed

        // System.out.println(Car.MAX_SPEED); : use this when the variable is static
        System.out.println(Car.MAX_SPEED); // use this when the var is an instace of the class
        // i couldnt instace another seller object becouse the reference is FINAL
        // car.SELLER = new Seller();
        System.out.println(car.SELLER);
        // but i can change the values in the Seller class
        car.SELLER.setName("Matheus");
        //the name was changed
        System.out.println(car.SELLER);

        // gives the jeep name
        jeep.setName("Compass");
        // using the final print method in car to print the jeep name
        jeep.Print();
    }
}
