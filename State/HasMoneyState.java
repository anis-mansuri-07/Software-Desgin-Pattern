package State;

public class HasMoneyState implements VendingMachineState {
    public void addCoin() {
        System.out.println("coin already Added.");
    }

    public void selectItem()
    {
        System.out.println("Item selected.");
    }

    public void despenseItem()
    {
        System.out.println("Select item first");
    }
}
