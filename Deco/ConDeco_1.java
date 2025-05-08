package Deco;

public class ConDeco_1 extends Decorator {
    @Override
    public String getDescription() {
        return component.getDescription() + " with ConDeco 1";
    }

    @Override
    public int getPrice() {
        return component.getPrice() + 5;
    }

    public ConDeco_1(Component component) {
        super(component);
    }

}
