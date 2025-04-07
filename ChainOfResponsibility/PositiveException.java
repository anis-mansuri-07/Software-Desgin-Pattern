package ChainOfResponsibility;

public class PositiveException implements IChain{
    @Override
    public void setNext(IChain nextChain) {

    }

    @Override
    public void process(Number request) {

    }
}
