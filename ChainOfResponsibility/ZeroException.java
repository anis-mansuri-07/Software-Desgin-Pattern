package ChainOfResponsibility;

public class ZeroException implements IChain{
    @Override
    public void setNext(IChain nextChain) {

    }

    @Override
    public void process(Number request) {

    }
}
