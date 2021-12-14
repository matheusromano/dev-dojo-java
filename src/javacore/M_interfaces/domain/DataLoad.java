package javacore.M_interfaces.domain;

// use the keyword interface to mark the class as an interface
// the interface acts like a contract, you must to implements all the methods inside the interface

public interface DataLoad {
    // "public" and "abstract" its redundant, because all of the methods inside an interface class
    // are by default public and abstract
    public abstract void Load();

    //working with static attributes and methods
    // by default all the attributes are public static final
    public static final int MAX_DATA_SIZE = 10;

    public static void RetreiveMaxDataSize() {
        System.out.println("inside the interface static method: " + MAX_DATA_SIZE);
    }


    //But now think that you want to add a method that would be used by all the other classes
    // you will have a lot of work to implement one by one in, like 1000 other classes
    // to fix this problem a Solution is use de "DEFAULT" keyword that makes the method auto-implemented to all of the classes

    default void CheckVerification() {
        System.out.println("Checking the verification in general");
    }
}
