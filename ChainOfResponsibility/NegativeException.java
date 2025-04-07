package ChainOfResponsibility;

public class NegativeException implements IChain{
    @Override
    public void setNext(IChain nextChain) {

    }

    @Override
    public void process(Number request) {

    }
}
