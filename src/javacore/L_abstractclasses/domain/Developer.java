package javacore.L_abstractclasses.domain;

public class Developer  extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void CalculateBonus() {
        this.salary = this.salary + this.salary * 0.15;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
