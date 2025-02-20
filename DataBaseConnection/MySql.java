package DataBaseConnection;

public class MySql implements IDBConnect {
    String connect;
    String disconnect;
    String query;
    MySql(){
        connect = "MySql Is Connected.";
        disconnect = "MySql Is DisConnected.";
        query = "SELECT * FROM mySqlDb;";

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
