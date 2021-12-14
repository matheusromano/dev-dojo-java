package javacore.N_polymorphism.test;

import javacore.N_polymorphism.domain.Computer;
import javacore.N_polymorphism.domain.Product;
import javacore.N_polymorphism.domain.SmartPhone;

public class ProductTest02 {
    public static void main(String[] args) {

        // this is a kind of polymorphism, a superclass been referenced to a subclass
        Product p1 = new Computer("Intel i9", 3000);

        System.out.println("Product 1");
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1.CalculateTax());

        Product p2 = new SmartPhone("Poco X3", 1500);
        System.out.println("Product 2");
        System.out.println(p2.getName());
        System.out.println(p2.getPrice());
        System.out.println(p2.CalculateTax());

        // the product class it self cannot be instaciate
        // Product product = new Product();



    }
}
