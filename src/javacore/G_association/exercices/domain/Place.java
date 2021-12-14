package javacore.G_association.exercices.domain;

public class Place {
    private String address;
    private Seminar[] seminars;

    //constructor

    public Place(String address, Seminar[] seminars) {
        this.address = address;
        this.seminars = seminars;
    }

    public Place(String address) {
        this.address = address;
    }

    // methods
    public void print() {
        System.out.println("Nome of the place: " + this.address);
        if (seminars != null) {
            System.out.println("Seminars given here: ");
            for (Seminar seminar : seminars) {
                System.out.println(seminar.getTitle() + " ");
            }

        }
    }
    // getters and setters

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
