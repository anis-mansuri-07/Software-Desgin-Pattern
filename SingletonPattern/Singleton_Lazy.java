package SingletonPattern;

//it is basic singleton pattern class which is not thread safe

public class Singleton_Lazy {
    private static Singleton_Lazy singleInstance;
    private Singleton_Lazy(){}
    public static Singleton_Lazy getInstance(){
        if (singleInstance == null) {
            singleInstance = new Singleton_Lazy();
        }
        return singleInstance;
    }
}
