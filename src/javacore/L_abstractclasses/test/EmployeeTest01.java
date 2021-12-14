package javacore.L_abstractclasses.test;

import javacore.L_abstractclasses.domain.Developer;
import javacore.L_abstractclasses.domain.Employee;
import javacore.L_abstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        // Abstract classes never has to be instanciate
        // Employee employee = new Employee()
        Manager manager = new Manager("Ronaldo Fenomeno" , 7000);
        Developer developer = new Developer("Matheus Fenomeno" , 15000);

        System.out.println(manager);
        System.out.println(developer);

        // subclasses of Employee using the abs method from person
        // extended by Employee and overrided the method
        manager.Print();
        developer.Print();
    }
}
