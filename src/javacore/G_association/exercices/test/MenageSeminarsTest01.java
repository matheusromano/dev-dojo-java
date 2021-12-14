package javacore.G_association.exercices.test;

import javacore.G_association.exercices.domain.Place;
import javacore.G_association.exercices.domain.Professor;
import javacore.G_association.exercices.domain.Seminar;
import javacore.G_association.exercices.domain.Student;

public class MenageSeminarsTest01 {
    public static void main(String[] args) {
        Place place01 = new Place("Guadalajara Street");
        Place place02 = new Place("Guadalajara Street");
        Student student01 = new Student("Matheus Romano", 20);
        Student student02 = new Student("Neymar Jr", 28);
        Student[] students = {};
        Professor professor01 = new Professor("Girafales","Buy Flowers");
        Seminar seminar02 = new Seminar("How to conquest Dona Florinda");
        Seminar seminar03 = new Seminar("How i became a Professor");
        Seminar seminar01 = new Seminar("How to be a flower Buyer", students, professor01, place01);
        Seminar[] seminars = {seminar01, seminar02, seminar03};
        Professor professor02 = new Professor(professor01.getName(),professor01.getResearchField(), seminars);


        //Printing
        System.out.println("!----------------------------");
        seminar01.print();
//        System.out.println("!----------------------------");
//        professor02.print();
//        System.out.println("!----------------------------");
//        place02.print();




    }
}
