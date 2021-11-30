package introdution;

public class Class06LoopStatements02 {
    // print all the even number from 0 to 100000
    public static void main(String[] args) {
        int odd = 0;
        int m1 = 1000000;
        for (int i = m1; i >= 0  ; i--) {
            if(i%2==1) {
                odd = i;
                System.out.println("this number is EVEN: " + odd);
            }

        }


    }
}
