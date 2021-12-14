package javacore.H_inheritence.domain;

public class Employee {

    // the protected access modifier allow all the subclass anywhere in the project
    // and classes in the same package to modify their values
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected double salary;
    static{
        System.out.println("Inside employee static init block");
    }
    {
        System.out.println("Inside employee init block 1");
    }
    {
        System.out.println("Inside employee ini block 2");
    }

    public Employee (String name) {
        System.out.println("Inside employee constructor");
        this.name = name;
    }

//    Methods
    public void print() {
        System.out.println(this.name);
        System.out.println(this.socialSecurityNumber);
        System.out.println(this.salary);
        System.out.println(this.address.getStreet() + " " +this.getAddress().getZipCode());
    }


// getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
