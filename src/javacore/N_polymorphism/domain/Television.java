package javacore.N_polymorphism.domain;

public class Television extends Product{
    public static final double TAX_PERCENTAGE = 0.20;
    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double CalculateTax() {
        System.out.println("Calculating tax value for Television");
        return this.price * TAX_PERCENTAGE ;
    }
}
