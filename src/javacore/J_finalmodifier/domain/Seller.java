package javacore.J_finalmodifier.domain;

public class Seller {
    private String name;

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
