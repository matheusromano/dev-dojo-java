package introdution;
public class Class05ConditionalStatements06 {
    public static void main(String[] args) {
        int day = 1;
        // char, int, byte, short, enum, string
        // Using switch print if the day is bussines day or weekday
        // Giving the numbers 1 to 7, 1 being Sunday
        switch (day) {
            case 1: case 7:
                System.out.println("Weekend");
                break;
            case 2: case 3: case 4:
            case 5: case 6:
                System.out.println("Bussiness Days");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
