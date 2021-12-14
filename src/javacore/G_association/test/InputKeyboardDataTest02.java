package javacore.G_association.test;

import java.util.Scanner;

public class InputKeyboardDataTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the best master IA BMI");
        System.out.println("Ask your question and wait the reply");
        String question = input.nextLine();
        if(question.charAt(0) == ' '){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
