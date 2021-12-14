package javacore.B_introductionmethods.test;

import javacore.B_introductionmethods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.sumTwoNumbers();

        System.out.println("Finishing Sum");

        calc.subtractTwoNumbers();
        System.out.println("Finishing Subtract");

        // cast the 20d to int
        int num = (int) 20d;
        calc.multiplyTwoNumbers(num, 4);
        System.out.println("Finishing Multiply");
    }
}
