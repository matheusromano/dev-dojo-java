package introdution;

public class Class04Operators {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 45;
        int result = number01 * number02;
        // cast the number02 to double
        double result1 = number01 / (double)number02;


        System.out.println(number01 + number02 + "Value: " + number01 + number02 + result);
        System.out.println(result);
        System.out.println(result1);

        // % mod = return the rest of a division opertator
        int module = 21%7;
        System.out.println(module);

        // <> <= >= != ==
        boolean isTenLowerThenTwenty = 10 < 20;
        boolean isTenGreaterThenTwenty = 10 > 20;
        boolean isTenLowerOrEqualsThenTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualsThenTwenty = 10 >= 20;
        boolean isTenDifferentThenTwenty = 10 != 20;
        boolean isTenEqualsThenTwenty = 10 == 20;
        System.out.println("isTenLowerThenTwenty " + isTenLowerThenTwenty);
        System.out.println("isTenGreaterThenTwenty " + isTenGreaterThenTwenty);
        System.out.println("isTenLowerOrEqualsThenTwenty " + isTenLowerOrEqualsThenTwenty);
        System.out.println("isTenGreaterOrEqualsThenTwenty " + isTenGreaterOrEqualsThenTwenty);
        System.out.println("isTenDifferentThenTwenty " + isTenDifferentThenTwenty);
        System.out.println("isTenEqualsThenTwenty " + isTenEqualsThenTwenty);


        // Logical operators && (AND) || OR !

        int age = 35;
        float salary = 5000F;
        // AND operator = &&
        boolean isLegalOlderThenThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThenThirty = age < 30 && salary >= 3381;
        System.out.println("isLegalOlderThenThirty " + isLegalOlderThenThirty);
        System.out.println("isLegalYoungerThenThirty "  + isLegalYoungerThenThirty);

        // OR operator = ||
        double currentAccount = 400;
        double savingsAccount = 4500;
        double motocyclePrice = 2500;
        boolean canBought = currentAccount > motocyclePrice || savingsAccount > motocyclePrice;
        System.out.println("Can i bought the motocycle? " + canBought);


        // = += -= *= /= %= Compound operators
        double bonus = 1800;
        bonus += 2000; // bonus = bonus + 2000
        bonus -= 1000;
        bonus /= 3;
        bonus *= 10;
        bonus %=1;
        System.out.println(bonus);

        // unary ++ --
        int count = 0;
        ++count;
        System.out.println(count--);
        System.out.println(count);


    }
}
