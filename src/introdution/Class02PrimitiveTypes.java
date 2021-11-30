package introdution;

public class Class02PrimitiveTypes {
    public static void main(String[] args) {
        // int, double, float, boolean, char, byte, short, long
        int age = 10;
        long bigNumber = 10000;
        float salaryFloat = 2500.45F;
        double salaryDouble = 5000;
        boolean trueFalse = true;
        boolean falseTrue = false;
        short ageShort = 29;
        byte ageByte = 125;
        char character = 'W';
        String name = "Matheus";
        // var used to make the compiler interpret the type
        var address = "456 East side";
        System.out.println("The age is "+age+" years old");
        System.out.println(character);
        System.out.println(salaryFloat);
        System.out.println(bigNumber);
        System.out.println("My name is "+ name +" and i live in " + address);
    }
}
