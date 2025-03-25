package sample;

public interface Demo {
    void enter();
    Demo clo();
}

class Demo1 implements Demo{
    @Override
    public void enter() {

    }

    @Override
    public Demo1 clo() {
        return null;
    }
}
