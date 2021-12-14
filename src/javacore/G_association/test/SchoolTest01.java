package javacore.G_association.test;

import javacore.G_association.domain.Professor;
import javacore.G_association.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor("Romanov");
        Professor professor1 = new Professor("Gorbachev");
        Professor[] professors = {professor, professor1};
        School school = new School("Moscou", professors);


        school.print();

    }
}
