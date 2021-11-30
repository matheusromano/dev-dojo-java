package introdution;

public class Class06LoopStatements01 {
    public static void main(String[] args) {
        // while - do/while, for
        int counter = 0;
        while (counter < 10) {
            System.out.println(++counter);
//            counter ++;
        }

        counter = 0;
        do {
            System.out.println("Inside do While: " + ++counter);
        } while(counter < 10);

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("inside for " +i);
        }


    }
}
