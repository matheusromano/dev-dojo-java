package javacore.G_association.exercices.domain;

public class Seminar {
    private String title;
    private Student[] students;
    private Professor professor;
    private Place place;

    // constructor


    public Seminar(String title, Student[] students, Professor professor, Place place) {
        this(title, professor, students);
        this.place = place;
    }

    public Seminar(String title, Professor professor, Student[] students) {
        this(title, students);
        this.professor = professor;
    }

    public Seminar(String title, Student[] students) {
        this.title = title;
        this.students = students;
    }

    public Seminar(String title) {
        this.title = title;
    }

    // methods
    public void print() {
        System.out.println("Title of Seminar: " + this.title);
        if(this.professor != null) {
            System.out.println("Ministered by: " + this.professor.getName());
        }
        if (students.length < 0) {
            System.out.println("This seminar dont have any students");
        } else {
            for (Student student : students) {
                System.out.println("!===================!");
                System.out.println("Studant Name: " + student.getName());
                System.out.println("Studant Age: " + student.getAge());
                System.out.println("!===================!");
            }
        }
        if (place != null) {
            System.out.println("The seminar will be present at: " + place.getAddress());
        }
    }


    // getters and setters


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
