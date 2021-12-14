package javacore.K_enumeration.test;

import javacore.K_enumeration.domain.Costumer;
import javacore.K_enumeration.domain.CostumerType;
import javacore.K_enumeration.domain.PaymentType;

public class CostumerTest01 {
    public static void main(String[] args) {

        // set the constructor with the type of the costumer, mitigating the problems with typing
        Costumer costumer01 = new Costumer("Oracle", CostumerType.COMPANY, PaymentType.CREDIT);
        Costumer costumer02 = new Costumer("HeyTech", CostumerType.INDIVIDUAL, PaymentType.DEBIT);
        Costumer costumer03 = new Costumer("DigiTron", CostumerType.START_UP, PaymentType.DEBIT);

        System.out.println(costumer01);
        System.out.println(costumer02);
        System.out.println(costumer03);

        System.out.println(PaymentType.CREDIT.CalculateDiscount(100));
        System.out.println(PaymentType.DEBIT.CalculateDiscount(100));
        CostumerType costumerType = CostumerType.getReportByName("Company");
        System.out.println(costumerType);




    }
}
