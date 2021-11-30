package introdution;
public class Class05ConditionalStatements04 {
    public static void main(String[] args) {
        // How much do you have to pay in tax based in your salary in Brazil
        double salary = 2500;
        double initSalary = salary;
        // (condition) ? < true> : <false>
        salary = salary <= 1906.98 ? salary :
                 salary <= 2826.65 ? salary * 0.925 :
                 salary <= 3751.05 ? salary * 0.85 :
                 salary <= 4664.68 ? salary * 0.775 : salary * 0.725;
        System.out.printf("Your salaray after the taxes is: %.1f%n", salary);
        System.out.printf("The amount of money that the government takes from you: %.1f", initSalary - salary);
    }
}
