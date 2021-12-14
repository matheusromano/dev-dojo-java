package javacore.N_polymorphism.domain;

public class SmartPhone extends Product{

    public static final double TAX_PERCENTAGE = 0.20;

    public SmartPhone(String name, double price) {
        super(name, price);
    }

    @Override
    public double CalculateTax() {
        System.out.println("Calculating tax value for Smartphone");
        return this.price * TAX_PERCENTAGE ;
    }
}
