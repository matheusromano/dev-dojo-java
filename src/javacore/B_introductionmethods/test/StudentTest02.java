package javacore.B_introductionmethods.test;

import javacore.B_introductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Zézinho";
        student01.age = 45;
        student01.gender = 'M';

        student02.name = "Mariazinha";
        student02.age = 56;
        student02.gender = 'F';

        student01.print();
        student02.print();
    }
}
