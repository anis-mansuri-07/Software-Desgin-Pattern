package TaxCalculation;

public class AMC extends Tax{
    @Override
    double roadTaxCal() {
        return 100.2;
    }

    @Override
    double propertyTaxCal() {
        return 100.3;
    }

    @Override
    double waterTaxCal() {
        return 100.1;
    }
}
