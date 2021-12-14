package javacore.H_inheritence.domain;

// in java you can only extends from only one class
public class Menager extends Employee{
    private String departament;

    static{
        System.out.println("Inside manager static init block");
    }
    {
        System.out.println("Inside manager init block 1");
    }
    {
        System.out.println("Inside manager init block 2");
    }

    public Menager(String name) {
        // thats the way to make a reference to a superclass inside a constructor
        super(name);
    }


    // literally override a method of the superclass to fit the class tasks
    @Override
    public void print() {
        // the super keyword make reference to the superclass
        super.print();
        System.out.println(this.departament);
    }

    public void paymentReport() {
        System.out.println("the employee " + this.name + "from the departament " + this.departament + "received a salary of " + this.salary);
    }
    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }
}
