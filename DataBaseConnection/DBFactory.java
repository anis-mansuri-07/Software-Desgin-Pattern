package DataBaseConnection;



public class DBFactory {
    public static IDBConnect getDbConnection(String dbType){
        IDBConnect db = null;
        switch (dbType.toLowerCase()) {
            case "mysql" -> db = new MySql();
            case "postgresql" -> db = new PostgreSql();
            case "mssql" -> db = new MsSql();
            case "mongodb" -> db = new MongoDB();
            default -> throw new IllegalArgumentException("Invalid Choice");
        }
        return db;


    }
}
