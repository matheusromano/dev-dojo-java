package introdution;

public class Class05ConditionalStatements02 {
    public static void main(String[] args) {
        /*
        age = 15 equals to junior;
        age = 18 equals to senior;
        age  = 20 equal to master;
         */

        int age  = 13;
        String categoty;
        String category1;
        if(age < 15) {
            categoty = "without classification";
        }
        else if(15 >= age  && age <= 18) {
            categoty = "Junior";
        }
        else if(age > 18 && age <= 20 ) {
            categoty = "Senior";
        }
        else {
            categoty = "Master";
        }

        // ternary with more then one possible results
        category1 = age < 15 ? "Junior" : age >= 15 && age <= 18 ? "Senior" : "master";
        System.out.println(category1);
    }
}
