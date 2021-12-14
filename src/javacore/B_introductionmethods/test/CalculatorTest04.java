package javacore.B_introductionmethods.test;

import javacore.B_introductionmethods.domain.Calculator;

public class CalculatorTest04 {
    // interesting way using string... instead string[]
    public static void main(String... args) {
        Calculator calc = new Calculator();
        int[] numbers = {1,2,3,4,5,6};
        calc.sumArray(numbers);
        // with varargs you dont need to create an Array to use as an Argument
        calc.sumVarArgs(2, 1,2,3,4);
    }
}
