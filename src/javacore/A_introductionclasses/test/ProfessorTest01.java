package javacore.A_introductionclasses.test;

import javacore.A_introductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Marlos";
        professor.age = 25;
        professor.gender = 'M';

        System.out.printf(" Name: %s\n Age: %d\n Gender: %C", professor.name, professor.age, professor.gender);

    }
}
