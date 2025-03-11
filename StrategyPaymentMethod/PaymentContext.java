package StrategyPaymentMethod;

public class PaymentContext {
    private IPaymentMethod iPaymentMethod;
    public void setiPaymentMethod(IPaymentMethod iPaymentMethod){
        this.iPaymentMethod = iPaymentMethod;
    }
    public String doPayment(int price){
        return iPaymentMethod.Pay(price);
    }
}
