package javacore.H_inheritence.test;

import javacore.H_inheritence.domain.Address;
import javacore.H_inheritence.domain.Employee;
import javacore.H_inheritence.domain.Menager;


public class InheritenceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("12th Ave");
        address.setZipCode("12345");
        Employee employee = new Employee("Sr Joel");
        employee.setName("Matheus");
        employee.setSocialSecurityNumber("12451213");
        employee.setSalary(154444);
        employee.setAddress(address);
        employee.print();

        System.out.println("--------------");
        Menager menager = new Menager("Sr James");
        menager.setName("Oda Acurana");
        menager.setSocialSecurityNumber("4542121");
        menager.setSalary(78777545);
        menager.setAddress(address);
        menager.setDepartament("Sales");


        menager.print();
        menager.paymentReport();

    }

}
