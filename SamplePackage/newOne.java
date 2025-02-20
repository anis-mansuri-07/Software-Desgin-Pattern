package SamplePackage;
class sample{
    static {
        System.out.println("Sample static block");
    }
    sample(){
        System.out.println("Const");
    }
    void Sam(){
        System.out.println("sam");
    }
    {
        System.out.println("Yess");
    }
}
public class newOne {
    static {
        System.out.println("This is static block");
    }

    public static void main(String[] args) {
        System.out.println("Main class");
        sample s = new sample();
        s.Sam();
    }
}
