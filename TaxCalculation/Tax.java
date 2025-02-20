package TaxCalculation;

public abstract class Tax {
    abstract double roadTaxCal();
    abstract double propertyTaxCal();
    abstract double waterTaxCal();

    public String taxPayment(){
        return "Payment Successful";
    }

}
