package PrototypeCar;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        Car originalCar = new Car("Tesla Model S", "Red");
        originalCar.showCar();

        // Cloning the car
        Car clonedCar = (Car) originalCar.clone();
        clonedCar.setModel("Tata Punch");
        clonedCar.showCar();
    }
}
