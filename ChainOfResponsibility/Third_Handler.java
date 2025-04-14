package ChainOfResponsibility;

public class Third_Handler extends IException{
//    @Override
//    public void setException(IException handler) {
//        //nothing
//    }

    @Override
    public void exceptionHandler(Exception e) {
        System.out.println("Handled by Last Handler"+e.getMessage());
    }
}
