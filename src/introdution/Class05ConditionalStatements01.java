package introdution;

public class Class05ConditionalStatements01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAllowedToBuyBeers = age >= 18;
        if (isAllowedToBuyBeers) {
            System.out.println("Can buy beers");
        } else {
            System.out.println("not allowed to buy beers");
        }

        if (!isAllowedToBuyBeers) { // logical not

        }
        System.out.println("outside if");
    }
}
