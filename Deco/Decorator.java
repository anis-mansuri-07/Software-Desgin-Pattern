package Deco;

public abstract class Decorator implements Component{
    protected  Component component;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public String getDescription() {
        return component.getDescription();
    }

    @Override
    public int getPrice() {
        return component.getPrice();
    }
}
