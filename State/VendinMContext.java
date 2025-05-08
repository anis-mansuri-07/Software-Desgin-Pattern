package State;

public class VendinMContext {
    int Stock;
    VendingMachineState idelState;
    VendingMachineState hasMoneyState;
    VendingMachineState despensingState;
    VendingMachineState outOfStockState;
    VendingMachineState currentState;

    public VendinMContext(int Stock) {
        idelState = new IdleSate();
        hasMoneyState = new HasMoneyState();
        despensingState = new DespenseState();
        outOfStockState = new OutOfStock();
        this.Stock = Stock;
        if (Stock > 0) {
            currentState = idelState;
        } else {
            currentState = outOfStockState;
        }
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void addCoin() {
        currentState.addCoin();
        if (currentState == idelState && Stock > 0) {

            setState(hasMoneyState);
        } else if (currentState == outOfStockState) {

            setState(outOfStockState);
        }

    }

    public void selectItem() {
        currentState.selectItem();
        if (currentState == hasMoneyState) {
            setState(despensingState);
        }
    }

    public void despenseItem() {
        currentState.despenseItem();
        if (currentState == despensingState) {
            Stock--;
            if (Stock > 0) {
                currentState = idelState;
            } else {
                currentState = outOfStockState;
            }
        }

    }

}
