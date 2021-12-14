package javacore.B_introductionmethods.domain;

public class StudentPrinter {
    public void printStudent(Student student) {
        System.out.println("------------------------");

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);

        // never change the value of the objects directly, its not a good pratice
        student.name = "Carlinhos";
    }
}
