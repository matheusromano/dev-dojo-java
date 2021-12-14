package javacore.B_introductionmethods.test;

import javacore.B_introductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 15;
        int b = 20;

        // the values dont get the reference of each other
        calc.changeNumbers(a, b);
        System.out.println("Inside CalculatorTest03");
        System.out.println("number1 " + a);
        System.out.println("number2 " + b);

    }
}
