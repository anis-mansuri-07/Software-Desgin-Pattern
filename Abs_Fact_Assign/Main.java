package Abs_Fact_Assign;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter cuisine Type (Indian,Chinese)");
        String Cuisine=sc.next();
        AbstractFactory afobj=AbstractFactory.getFactory(Cuisine);
        
        Appetizers ap = afobj.getappetizers();
        System.out.println(ap.prepar());


        Maincourse mc = afobj.getMaincourse();
        System.out.println(mc.prepare());

        Desserts di=afobj.getdesserts();

        System.out.println(di.prepar());


    }
}
