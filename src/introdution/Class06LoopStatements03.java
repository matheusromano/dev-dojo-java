package introdution;

public class Class06LoopStatements03 {
    // print all the even number from 0 to 100000
    public static void main(String[] args) {
        // given a total number, for example 50, print first 25
        int n1 = 50;
        for (int i = 0; i <= n1; i++) {
            if(i > n1/2) {
                break;
            }
            System.out.println(i);

        }
        System.out.println("outside for");
    }
}

