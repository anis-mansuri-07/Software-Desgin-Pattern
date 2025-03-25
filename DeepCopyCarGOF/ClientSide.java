package DeepCopyCarGOF;

public class ClientSide {
    public static void main(String[] args) {
        //more vehicles truck / bus etc
        System.out.println("First Time For Car");
        IVehicle car = new Car("BMW",5000000,new Engine("BMW S58"));
        System.out.println("Before Clone: Original");
        car.showDetails();
        System.out.println("After Clone: Copy");
        Car car1 = (Car) car.clone();
        car1.setPrice(7500000);
        car1.setEngine(new Engine("BMW H55"));
        car1.showDetails();

        System.out.println("---------------------------------------------------------------------");

        System.out.println("First Time For Bike");
        IVehicle bike = new Bike("Honda",25000,new Engine("HONDA 999cc"));
        System.out.println("Before Clone: Original");
        bike.showDetails();
        System.out.println("After Clone: Copy");
        Bike bike1 = (Bike) bike.clone();
        bike1.setPrice(30000);
        bike1.setEngine(new Engine("HONDA 125cc"));
        bike1.showDetails();

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Cloning Object Check");
        System.out.println(((Car) car).getHashCode()== car1.getHashCode());





    }
}
