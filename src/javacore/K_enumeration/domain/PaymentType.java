package javacore.K_enumeration.domain;

public enum PaymentType {
        CREDIT(0, 0.05, 0) {
            @Override
            public double CalculateDiscount(double value) {
                return value * CREDIT_DISCOUNT;
            }
        },
        DEBIT(1, 0, 0.1){
            @Override
            public double CalculateDiscount(double value) {
                return value * DEBIT_DISCOUNT;
            }
        };

        public final int DB_PAYMENT_VALUE;
        public final double CREDIT_DISCOUNT;
        public final double DEBIT_DISCOUNT;

        PaymentType(int DB_PAYMENT_VALUE, double CREDIT_DISCOUNT, double DEBIT_DISCOUNT){
            this.DB_PAYMENT_VALUE = DB_PAYMENT_VALUE;
            this.CREDIT_DISCOUNT = CREDIT_DISCOUNT;
            this.DEBIT_DISCOUNT = DEBIT_DISCOUNT;
        }

        // this is an abstract class that MUST to be override, and do not contains any kind of body
        public abstract double CalculateDiscount(double value);
}

