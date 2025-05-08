package State;

public class StateClient {
    public static void main(String[] args) {
        VendinMContext vm = new VendinMContext(2);
//        vm.addCoin();
//        vm.selectItem();
        vm.despenseItem();
//
//        vm.addCoin();
        vm.selectItem();
        vm.despenseItem();
//        vm.addCoin();
//        vm.selectItem();
//        vm.despenseItem();

    }
}
