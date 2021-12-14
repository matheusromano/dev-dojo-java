package javacore.A_introductionclasses.test;

import javacore.A_introductionclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        // initialize the reference variable "student"
        Student student = new Student();
        Student student2 = new Student();

        student.name = "farway";

        System.out.println(student.name);

        System.out.println(student2.name);
    }
}
