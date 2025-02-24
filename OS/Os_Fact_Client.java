package OS;

import java.util.Scanner;

public class Os_Fact_Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String osName = scanner.next();
        String productName =scanner.next();

        try {
            System.out.println(Abstract_Factory.resultString(Abstract_Factory.getOsName(osName), productName));
        }catch (IllegalArgumentException eae){
            System.out.println(eae.getMessage());
        }

    }
}
