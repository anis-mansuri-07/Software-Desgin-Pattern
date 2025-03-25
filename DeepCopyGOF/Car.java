package DeepCopyGOF;

public class Car implements CarPrototype {
    private String brand;
    private String model;
    private String color;
    private String transmission;
    private Engine engine; // Nested object

    public Car(String brand, String model, String color, String transmission, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.transmission = transmission;
        this.engine = engine;
    }

    // Deep Copy: Clone both the Car and its Engine
    @Override
    public CarPrototype clone() {
        return new Car(this.brand, this.model, this.color, this.transmission, this.engine.clone());
    }

    public void customizeCar(String newColor, String newTransmission) {
        this.color = newColor;
        this.transmission = newTransmission;
    }

    @Override
    public void showCar() {
        System.out.println("Car Brand: " + brand + " | Model: " + model + " | Color: " + color + " | Transmission: " + transmission);
        engine.showEngine();
    }
}

