package SingletonPattern;


public class SingleClient {

    public static void main(String[] args) {
    // this is basic lazy not thread safe way to create instance
    Singleton_Lazy singletonLazy = Singleton_Lazy.getInstance();
    System.out.println(singletonLazy.getClass());



    // this is basic eager thread safe way to create instance but use more resources
    Single_Basic_Safe_Eager singleBasicSafeEager = Single_Basic_Safe_Eager.getInstance();
    System.out.println(singleBasicSafeEager.getClass());



    // this is synchronized way to create instance thread safe but reduce performance due to synchronized
    Singleton_Synchronized singletonSynchronized = Singleton_Synchronized.getInstance();
    System.out.println(singletonSynchronized.getClass());


    // this approach improves performance  by reducing the overhead of synchronization
    Singleton_DoubleCheck_Synchronized singletonDoubleCheckSynchronized = Singleton_DoubleCheck_Synchronized.getInstance();
    System.out.println(singletonDoubleCheckSynchronized.getClass());


    }
}

