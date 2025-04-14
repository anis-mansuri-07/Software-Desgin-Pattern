package ChainOfResponsibility;

public class Second_Handler extends IException{
//    private IException third_handler;
//    @Override
//    public void setException(IException handler) {
//       this.third_handler = handler;
//    }

    @Override
    public void exceptionHandler(Exception e) {

        if (e instanceof NullPointerException){
            System.out.println("Handled by Second Handler"+e.getMessage());
        }else if(iException!=null){
            iException.exceptionHandler(e);
        }

    }
}
