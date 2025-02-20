package TaxCalculation;

import java.util.Scanner;

public class TaxPayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tax tax = null;

        System.out.print("Enter the City [amc,smc,vmc] : ");
        String city = scanner.next();

        tax = FactoryTax.getTax(city);
        System.out.print("Enter the Tax name : [roadtax,propertytax,watertax]");
        String taxname = scanner.next();

        double payableTax = FactoryTax.taxValue(taxname,tax);
        System.out.println("Your due : " + payableTax);

        System.out.println("Want To Pay Tax Now: [y/n]");
        String yn = scanner.next();
        if(yn.equalsIgnoreCase("y")){
            System.out.println(tax.taxPayment());
        } else if (yn.equalsIgnoreCase("n")) {
            System.out.println("Thank You");
        }else {
            System.out.println("Choice Not Valid");
        }



    }
}
