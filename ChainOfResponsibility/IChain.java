package ChainOfResponsibility;

public interface IChain {
    IChain nextIchain = null;
    void setNext(IChain nextChain);
    void process(Number request);
}
