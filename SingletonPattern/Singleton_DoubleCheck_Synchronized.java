package SingletonPattern;

// this approach improves performance  by reducing the overhead of synchronization

public class Singleton_DoubleCheck_Synchronized {
    private static Singleton_DoubleCheck_Synchronized singleton_doubleCheck_synchronized;

    private Singleton_DoubleCheck_Synchronized(){}

    public static Singleton_DoubleCheck_Synchronized getInstance(){
        if (singleton_doubleCheck_synchronized == null) {
            synchronized (Singleton_DoubleCheck_Synchronized.class){
                if (singleton_doubleCheck_synchronized == null) {
                    singleton_doubleCheck_synchronized = new Singleton_DoubleCheck_Synchronized();
                }
            }
        }
        return singleton_doubleCheck_synchronized;
    }
}
