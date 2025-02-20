package OS;

import java.util.Scanner;

public class Os_Fact_Client {
    public static void main(String[] args) {
        Abstract_Factory abs;

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter Os System: [Mac,Linux,Window]");
        String osName = scanner.next();


        //System.out.println("Enter Create Object: [IButton,IRadioButton,ICheckBox]");
        String productName =scanner.next();


//        abs = Abstract_Factory.getOsName(osName);

//       switch (productName.toLowerCase()){
//           case "button":
//               IButton bt = abs.getButton();
//               result = bt.createButton();
//               break;
//           case "checkbox":
//               ICheckBox cb = abs.getCheckBox();
//               result = cb.createCheckBox();
//               break;
//           case "radiobutton":
//               IRadioButton rb = abs.getRadioButton();
//               result = rb.createRadioButton();
//               break;
//           default:
//               result = "Invalid Choice";
//       }
//        String operationName = Abstract_Factory.resultString(abs,productName);
//        System.out.println(operationName);
        System.out.println(Abstract_Factory.resultString(Abstract_Factory.getOsName(osName),productName));

    }
}
