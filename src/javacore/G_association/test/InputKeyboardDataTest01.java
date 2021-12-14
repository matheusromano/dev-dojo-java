package javacore.G_association.test;

import java.util.Scanner;

public class InputKeyboardDataTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type yout full name");
        String next = input.nextLine();
        System.out.println("Please type your age");
        int age = input.nextInt();
        System.out.println("Please type M or F for your gender");
        char gender = input.next().charAt(0);

        System.out.println("!----------------!");
        System.out.println("Name: " + next);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);


    }
}
