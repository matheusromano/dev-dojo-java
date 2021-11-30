package introdution;

public class Class06LoopStatements04 {
    // print all the even number from 0 to 100000
    public static void main(String[] args) {
        /*
        Given a cars total price, for example 20000
        I want to find how much and for how long I'll have to pay monthly.
        Condition: the monthly payment cannot be lower than 1000
         */

        double carValue = 20000;
        for (int month = 1; month <= carValue ; month++) {
            double monthlyPrice = carValue / month;
//            carValue -= monthlyPrice;
            if(monthlyPrice < 1000) {
                break;
            }
            if(monthlyPrice >= 1000) {
                System.out.println("Months: " + month + " Price: " + monthlyPrice);
            }


        }
    }
}

