package StrategyPaymentMethod;

public class User {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setiPaymentMethod(new UPI());
        System.out.println(paymentContext.doPayment(1000));

    }
}
