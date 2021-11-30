package introdution;
public class Class05ConditionalStatements05 {
    public static void main(String[] args) {
        byte day = 10;
        // char, int, byte, short, enum, string
        switch (day) {
            case 1:
                System.out.println("Sun");
                break;
            case 2:
                System.out.println("Mon");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thu");
                break;
            case 6:
                System.out.println("Fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            default:
                System.out.println("the day didnt exist");
        }

        char gender = 'M';
        switch (gender) {
            case 'M': {
                System.out.println("Male");
                break;
            }
            case 'F': {
                System.out.println("Female");
                break;
            }
            default: {
                System.out.println("invalid");
            }
        }
    }
}
