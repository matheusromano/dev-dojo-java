package javacore.A_introductionclasses.test;

import javacore.A_introductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        // initialize the reference variable "student"
        Student student = new Student();
        student.age = 20;
        student.name = "Matheus";
        // char had to declarated with ' '
        student.gender = 'M';
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.gender);
    }
}
