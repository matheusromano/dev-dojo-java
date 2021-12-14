package javacore.B_introductionmethods.domain;

public class Calculator {
    public int age;

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(50 - 26);
    }

    public void multiplyTwoNumbers(int a, float b) {
        System.out.println(a * b);
    }


    // return have to to
    public double divideNumbers(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public double divideNumbers01(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }

    public void printTwoNumbersDivided(double a, double b) {
        if (b == 0) {
            System.out.println("Cant't divide by 0");
            // using return as a brake in the void methods, work just like an Else statement
            return;
        }
        System.out.println(a / b);
    }

    public void changeNumbers(int a, int b) {

        a = 99;
        b = 45;
        System.out.println("Inside showNumbers method");
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    // the varargs(...) allows to pass how many arguments we want
    // if you want to pass more than one parameter you have to put this before than the var args
    public void sumVarArgs(double mult, int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
            sum *= mult;
        }

        System.out.println(sum);
    }
}
