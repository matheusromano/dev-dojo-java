package introdution;

public class Class05ConditionalStatements03 {
    public static void main(String[] args) {
        // if salary > 5000 "buy a house" "dont buy"
        float salary = 6540;
        String cantBuy = "don't buy the house";
        String canBuy = "Buy a new house";
        // (condition) ? < true> : <false>
        String result = (salary >= 5000)? canBuy : cantBuy;
        System.out.printf("Your salary is: %.1f%n%10s",salary, result);

    }
}
