package javacore.K_enumeration.domain;

public class Costumer {

    // the way to create a enum inside a class
//    public enum Payment{
//        CREDIT(0),
//        DEBIT(1);
//
//        public final int DB_PAYMENT_VALUE;
//
//        Payment(int DB_PAYMENT_VALUE){
//            this.DB_PAYMENT_VALUE = DB_PAYMENT_VALUE;
//        }
//    }

    public String name;
    //the way to call a enum class
    public CostumerType type;
    public PaymentType payment;

    public Costumer(String name, CostumerType type, PaymentType payment) {
        this.name = name;
        this.type = type;
        this.payment = payment;
    }

    // the new information becomes the enum must be implement here to shows up
    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", type=" + type.report +
                ", db_value=" + type.DB_VALUE +
                ", payment=" + payment +
                ", db_payment_value=" + payment.DB_PAYMENT_VALUE +
                (payment.DB_PAYMENT_VALUE == 0 ? ", credit_discount" + payment.CREDIT_DISCOUNT : ", debit_discount" + payment.DEBIT_DISCOUNT) +
                '}';
    }
}
