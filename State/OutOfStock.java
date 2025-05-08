package State;

public class OutOfStock implements VendingMachineState {
    public void addCoin() {
        System.out.println("Out of Stock");
    }

    public void selectItem() {
        System.out.println("Out of Stock");
    }

    public void despenseItem() {
        System.out.println("Out of Stock");
    }
}
