package javacore.G_association.domain;

public class School {
    private String name;
    // it means that will be many(professors) to one (school)
    private Professor[] professors;

    public School(String name, Professor[] professors) {
        this.name = name;
        this.professors = professors;
    }

    public School(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        if (professors == null) return;
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
