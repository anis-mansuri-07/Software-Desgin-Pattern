package State;

public class IdleSate implements VendingMachineState {
    public void addCoin() {
        System.out.println("coin Added.");
    }

    public void selectItem()
    {
        System.out.println("No avlbl coin.");
    }

    public void despenseItem()
    {
        System.out.println("Added first coin.");
    }
}
