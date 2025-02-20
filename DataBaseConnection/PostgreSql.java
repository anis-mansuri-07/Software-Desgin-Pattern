package DataBaseConnection;

public class PostgreSql implements IDBConnect {
    String connect;
    String disconnect;
    String query;
    PostgreSql(){
        connect = "PostgreeDb Is Connected.";
        disconnect = "PostgreeDb Is DisConnected.";
        query = "SELECT * FROM PostgreeDb;";

    }
    @Override
    public String Connect() {
        return connect;
    }

    @Override
    public String DisConnect() {
        return disconnect;
    }

    @Override
    public String Query() {
        return query;
    }
}
