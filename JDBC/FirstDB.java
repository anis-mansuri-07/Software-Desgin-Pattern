package JDBC;

import java.sql.*;

public class FirstDB {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/JDBC";
    private static final String username = "root";
    private static final String password = "";

    public static void main(String[] args) {

        try{

            Connection connection = DriverManager.getConnection(URL,username,password); // create a connection between db and code
            Statement statement = connection.createStatement(); // return the statement to perform query
            //statement.executeUpdate("create table db(id int,name varchar(25))"); //query perform CRUD and which not return anything
            int noOfColumnAdded = statement.executeUpdate("insert into db values(3,'AnishMansuri'),(4,'kayHeruwala')");
            System.out.println(noOfColumnAdded); //return number if statement you inserted

//getcountmethod 
            int id = 1;
            String name = "Anish";
            String rs = String.format("select * from db where id = %d and name = '%s'",id,name); //this is for dynamic data fetching in system
            ResultSet rs2 = statement.executeQuery(rs);
            while (rs2.next()){
                System.out.println(rs2.getInt("id")+ "   " +rs2.getString("name"));
            }

            System.out.println("----------------------------------------------------");


            ResultSet resultSet = statement.executeQuery("select * from db;"); // this returns all data from db and stored in object
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+ "    " + resultSet.getString("name"));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}