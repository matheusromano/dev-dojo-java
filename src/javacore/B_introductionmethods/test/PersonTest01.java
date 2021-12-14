package javacore.B_introductionmethods.test;

import javacore.B_introductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Goku");
        person.setAge(12);
        person.print();
        //high coupling = bad
        // low coupling = god
        // you achieve the low coupling privating the class filds make it indepent from the main class
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
