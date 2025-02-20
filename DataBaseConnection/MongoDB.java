package DataBaseConnection;

public class MongoDB implements IDBConnect {
    String connect;
    String disconnect;
    String query;
    MongoDB(){
        connect = "MongoDB Is Connected.";
        disconnect = "MongoDB Is DisConnected.";
        query = "db.collection.find({})";

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
