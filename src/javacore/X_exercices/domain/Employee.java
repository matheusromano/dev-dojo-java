package javacore.X_exercices.domain;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private double average;

    public void print(){
        System.out.println("!---------------------!");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary);
    }

    public void averageSalary(double... salary){
        int sum = 0;
        int count = 0;
        for(double sal : salary){
            sum += sal;
            count++;
        }
        average = sum / count;
        System.out.println("!======================!");
        System.out.printf("The average of the salaries is: %.2f ", average);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // this variable must to be read only
    // public String getName() {
    // return name;
    // }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public double getAverage() {
        return average;
    }
}


