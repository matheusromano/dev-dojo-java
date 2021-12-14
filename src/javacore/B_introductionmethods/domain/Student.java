package javacore.B_introductionmethods.domain;

public class Student {
    public int age;
    public char gender;
    public String name;

    public void print() {
        System.out.println("---------------");
        // use this to refer to the classes atribute
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);

    }
}
