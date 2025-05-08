package Deco_Assign;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Main {
    public static void main(String[] args) {
        try {
           
            LogInputStrem lis = new LogInputStrem(new FileInputStream("text.txt"));

            // System.out.println(lis.read());
            // System.out.println(lis.read());
            // System.out.println(lis.read());
            // System.out.println(lis.read());
            // System.out.println(lis.read());
            // System.out.println(lis.read());
            // System.out.println(lis.read());
            // System.out.println(lis.read());
            
            // System.out.println(lis.read());
            
            // System.out.println(lis.read());
            
            // System.out.println(lis.read());
            

            // System.out.println(lis.numberOfWords());
            // System.out.println(lis.numberOfCharacter());
            // System.out.println(lis.numberOfLines());
        
           lis.close();
           LogOutputStream los = new LogOutputStream(new FileOutputStream("text.txt"));
           los.write('I');
           los.write(' ');
           los.write('A');
           los.write('m');
           System.out.println(los.numberOfCharacter());
          
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
