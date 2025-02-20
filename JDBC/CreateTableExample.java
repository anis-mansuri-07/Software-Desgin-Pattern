package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample { // Renamed class to avoid conflict with PreparedStatement class

    private static final String username = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/jdbctwo";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

            // Drop table if exists before creating it
            statement.executeUpdate("DROP TABLE IF EXISTS sample");
            statement.executeUpdate("CREATE TABLE sample (ids INT, name VARCHAR(20))");

            System.out.println("Table created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
