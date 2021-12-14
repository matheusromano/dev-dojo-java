package javacore.N_polymorphism.domain;

public class Computer extends Product{
    public static final double TAX_PERCENTAGE = 0.15;
    private int ram_memory;

    public Computer(String name, double price) {
        super(name, price);
    }

    public Computer(String name, double price, int ram_memory) {
        super(name, price);
        this.ram_memory = ram_memory;
    }

    @Override
    public double CalculateTax() {
        System.out.println("Calculating tax value for Computer");
        return this.price * TAX_PERCENTAGE;
    }

    public int getRam_memory() {
        return ram_memory;
    }

    public void setRam_memory(int ram_memory) {
        this.ram_memory = ram_memory;
    }
}
