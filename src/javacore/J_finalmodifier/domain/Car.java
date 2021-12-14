package javacore.J_finalmodifier.domain;

//when you use the final in the class declaration these one coulndt be extended to another ones
public class Car {
    private String name;
    // Reference types like objects
    // right here we say that the class must to be only one object called SELLER
    public final Seller SELLER = new Seller();
    //right here the method is not static (primitive types)
    public static final double MAX_SPEED;
    static {
        MAX_SPEED = 100;
    }

    //    static {
    //        MAX_SPEED = 150;
    //    }

    // exemple with a method that cant be overriding by ours subclass
    public final void Print() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
