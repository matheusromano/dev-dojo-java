package javacore.L_abstractclasses.domain;

// extends the abstract class employee
public class Manager extends Employee {

    // creates a constructor for the class with the super filds
    public Manager(String name, double salary) {
        super(name, salary);
    }


    // using abtract method every object has its own implementation
    @Override
    public void CalculateBonus() {
        this.salary = this.salary + this.salary * 0.08;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
