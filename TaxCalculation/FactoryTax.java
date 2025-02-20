package TaxCalculation;

public class FactoryTax {
    public static Tax getTax(String city){
        switch (city.toLowerCase()){
            case "amc":
                return new AMC();

            case "vmc":
                return new VMC();

            case "smc":
                return new SMC();

            default:
                throw new IllegalArgumentException();
        }
    }

    public static double taxValue(String taxType,Tax tax){
        switch (taxType.toLowerCase()){
            case "roadtax":
                return tax.roadTaxCal();

            case "watertax":
                return tax.waterTaxCal();

            case "propertytax":
                return tax.propertyTaxCal();

            default:
                throw new IllegalArgumentException();

        }
    }
}
