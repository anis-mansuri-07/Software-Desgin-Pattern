package State;

public class DespenseState implements VendingMachineState {
    public void addCoin() {
        System.out.println("coin already Added.");
    }

    public void selectItem()
    {
        System.out.println("Item alredy selected.");
    }

    public void despenseItem()
    {
        System.out.println("Item Despensing");
    }
}
