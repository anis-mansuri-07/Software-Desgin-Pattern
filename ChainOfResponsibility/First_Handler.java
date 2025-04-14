package ChainOfResponsibility;

public class First_Handler extends IException{
//    private IException second_handler;
//    @Override
//    public void setException(IException handler) {
//        this.second_handler = handler;
//    }

    @Override
    public void exceptionHandler(Exception e) {

    if (e instanceof ArithmeticException){
        System.out.println("Handled by First Handler"+e.getMessage());

    }else if(iException!=null){
        iException.exceptionHandler(e);
    }

    }
}
