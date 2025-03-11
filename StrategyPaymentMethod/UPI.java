package StrategyPaymentMethod;

public class UPI implements IPaymentMethod{
    @Override
    public String Pay(int price) {
        return "Using Upi You Have To Pay: "+ price;
    }
}
