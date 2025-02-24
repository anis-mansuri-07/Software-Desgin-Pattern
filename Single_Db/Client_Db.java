package Single_Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Client_Db {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("Url","Name","Password");
    }
}
