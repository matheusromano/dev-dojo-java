package javacore.L_abstractclasses.domain;


// abstract classes must be extended, its behavior like and tamplate for other classes
public abstract class Employee extends Person{
    public String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        // have to be called in the abstract class constructor
        this.CalculateBonus();
    }

    // the way to create abstract methods
    public abstract void CalculateBonus();


    // an Abstract class extending another abstract class
    // must to override their abs method
    @Override
    public void Print() {
        System.out.println("Printing that shi###");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
