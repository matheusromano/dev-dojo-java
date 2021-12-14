package javacore.B_introductionmethods.test;

import javacore.B_introductionmethods.domain.Student;
import javacore.B_introductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();

        student01.name = "Zézinho";
        student01.age = 45;
        student01.gender = 'M';

        student02.name = "Mariazinha";
        student02.age = 56;
        student02.gender = 'F';

        //first execution
        printer.printStudent(student01);
        printer.printStudent(student02);
        System.out.println("########################");
        // second execution
        printer.printStudent(student01);
        printer.printStudent(student02);

    }
}
