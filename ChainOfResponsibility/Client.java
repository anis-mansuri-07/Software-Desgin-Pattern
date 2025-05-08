package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
    IException first = new First_Handler();
    IException second = new Second_Handler();
    IException third = new Third_Handler();

    first.setException(second);
    second.setException(third);

    try{
        throw new NullPointerException();
    }catch (Exception e){
        first.exceptionHandler(e);
    }

    }
}
