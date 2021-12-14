package javacore.X_exercices.test;

import javacore.X_exercices.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee empl1 = new Employee();
        Employee empl2 = new Employee();
        Employee empl3 = new Employee();
        Employee employee = new Employee();

        empl1.setName("marquinho");
        empl1.setAge(25);
        empl1.setSalary(3);

        empl2.setName("Joaozinho");
        empl2.setAge(15);
        empl2.setSalary(3);

        empl3.setName("Mariza");
        empl3.setAge(77);
        empl3.setSalary(3);

        empl1.print();
        empl2.print();
        empl3.print();

        employee.averageSalary(empl1.getSalary(), empl2.getSalary(), empl3.getSalary());







    }
}
