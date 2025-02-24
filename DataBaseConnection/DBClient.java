// this is example of factory design pattern in java

package DataBaseConnection;
import java.util.Scanner;

public class DBClient {
    public static void main(String[] args) {
        IDBConnect DbCon;
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();

        try {
            DbCon = DBFactory.getDbConnection(type);
            System.out.println(DbCon.Connect());
            System.out.println(DbCon.Query());
            System.out.println(DbCon.DisConnect());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();

    }
}
