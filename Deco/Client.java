package Deco;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        component = new ConDeco_1(component);

        component = new ConDeco_1(component);

        System.out.println(component.getDescription());
        System.out.println(component.getPrice());
    }
}
