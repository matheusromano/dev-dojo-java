package javacore.G_association.exercices.domain;

public class Professor {
    private String name;
    private String researchField;
    private Seminar[] seminars;

    //constructor

    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public Professor(String name, String researchField, Seminar[] seminars) {
        this(name, researchField);
        this.seminars = seminars;
    }

    // methods
    public void print() {
        System.out.println("Professor name: " + this.name);
        System.out.println("Professor Research Field: " + this.researchField);
        if (seminars != null) {
            for (Seminar seminar : seminars) {
                System.out.println("Seminar given: " + seminar.getTitle());
                System.out.println("Happening at:  " + seminar.getPlace());
            }
        }
    }
    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
