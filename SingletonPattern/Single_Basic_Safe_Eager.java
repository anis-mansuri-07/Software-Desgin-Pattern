package SingletonPattern;

// this is basic eager thread safe way to create instance

public class Single_Basic_Safe_Eager {
    private static final Single_Basic_Safe_Eager single_basic_safe_eager = new Single_Basic_Safe_Eager() ;
    private Single_Basic_Safe_Eager(){}
    public static Single_Basic_Safe_Eager getInstance(){
        return single_basic_safe_eager;
    }
}
