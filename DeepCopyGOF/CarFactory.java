package DeepCopyGOF;

public class CarFactory {
    public static void main(String[] args) {
        // Creating Engine Prototype
        Engine standardEngine = new Engine("Hybrid", 200);

        // Creating Car Prototypes (Base Models)
        CarPrototype sedanPrototype = new Car("Toyota", "Camry", "Black", "Automatic", standardEngine);
        //CarPrototype suvPrototype = new Car("Tesla", "Model X", "White", "Electric", new Engine("Electric", 400));

        // Customers Order Custom Cars
        System.out.println(" Original Car Models:");
        sedanPrototype.showCar();
        //suvPrototype.showCar();

        // Cloning & Customizing Cars
        CarPrototype customer1Car = sedanPrototype.clone();
        ((Car) customer1Car).customizeCar("Red", "Manual"); // Customizing clone

       // CarPrototype customer2Car = suvPrototype.clone();
       // ((Car) customer2Car).customizeCar("Blue", "Automatic");

        // Displaying Cloned & Customized Cars
        System.out.println("\n Customized Cars for Customers:");
        customer1Car.showCar();
        //customer2Car.showCar();

        // Verifying Original Models are Unchanged
        System.out.println("\n Verifying Original Prototypes Remain Unchanged:");
        sedanPrototype.showCar();
       // suvPrototype.showCar();

        System.out.println(sedanPrototype);
    }
}
