package SingletonPattern;

// this is synchronized way to create instance thread safe but reduce performance due to synchronized

public class Singleton_Synchronized {
    private static Singleton_Synchronized singleton_synchronized;
    private Singleton_Synchronized(){}
    public static synchronized Singleton_Synchronized getInstance(){
        if (singleton_synchronized == null) {

            singleton_synchronized = new Singleton_Synchronized();
        }
        return singleton_synchronized;
    }
}
