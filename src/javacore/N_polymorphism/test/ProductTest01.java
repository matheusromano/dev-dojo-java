package javacore.N_polymorphism.test;

import javacore.N_polymorphism.domain.Computer;
import javacore.N_polymorphism.domain.SmartPhone;
import javacore.N_polymorphism.domain.Television;
import javacore.N_polymorphism.service.ReportService;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Ryzen 5", 5000, 8);
        SmartPhone smartPhone = new SmartPhone("Iphone 13", 7000);
        // create another product from Product class and using the same method to print its report
        Television television = new Television("LG 72\"", 3750);

        ReportService.generateTaxReport(computer);
        System.out.println("!----------------------------------!");
        ReportService.generateTaxReport(smartPhone);
        System.out.println("!----------------------------------!");
        ReportService.generateTaxReport(television);
    }
}
