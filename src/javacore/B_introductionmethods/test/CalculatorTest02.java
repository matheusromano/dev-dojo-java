package javacore.B_introductionmethods.test;

import javacore.B_introductionmethods.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result  = calc.divideNumbers(6, 0);
        System.out.println(result);
        System.out.println(calc.divideNumbers(6, 0));
        System.out.println(calc.divideNumbers01(6, 2));
        calc.printTwoNumbersDivided(20, 0);
    }
}
