package Deco;

public class ConcreteComponent implements Component{
    @Override
    public String getDescription() {
        return "Concrete Component";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
