package DataBaseConnection;

public class MsSql implements IDBConnect {
    String connect;
    String disconnect;
    String query;
    MsSql(){
        connect = "MsSql Is Connected.";
        disconnect = "MsSql Is DisConnected.";
        query = "SELECT * FROM msSqlDb;";

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
