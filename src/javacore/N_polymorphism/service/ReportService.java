package javacore.N_polymorphism.service;

import javacore.N_polymorphism.domain.Computer;
import javacore.N_polymorphism.domain.Product;
import javacore.N_polymorphism.domain.SmartPhone;

public class ReportService {
//    public static void generateComputerTaxReport(Computer c) {
//        System.out.println("Staring the report for Computer: ");
//        System.out.println("Name: " + c.getName());
//        System.out.println("Price: " + c.getPrice());
//        System.out.println("Tax value: " + c.CalculateTax());
//    }
//
//    public static void generateSmartPhoneTaxReport(SmartPhone sp) {
//        System.out.println("Staring the report for Smartphone: ");
//        System.out.println("Name: " + sp.getName());
//        System.out.println("Price: " + sp.getPrice());
//        System.out.println("Tax value: " + sp.CalculateTax());
//    }


    // a polymorphical way to generate reports to all of products subclasses, a nice solution to scalable applications
    // the name of this technic is "Wilding Cast"
    public static void generateTaxReport(Product p) {
        System.out.println("Staring the tax report: ");
        System.out.println("Product: " + p.getName());
        System.out.println("Price: " + p.getPrice());

        // narrow casting, a kind of personalization of the report conditioning by the instace of the Product p
        // instanceof tests if the expression is true or false
        if(p instanceof Computer) {
            System.out.println("Ram memory: " + ((Computer) p).getRam_memory());
        }
        System.out.println("Tax value: " + p.CalculateTax());
    }
}
