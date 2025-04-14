package ChainOfResponsibility;

public abstract class IException {
    protected IException iException;
    void setException(IException handler){
        this.iException = handler;
    }
    public abstract void exceptionHandler(Exception e);
}
