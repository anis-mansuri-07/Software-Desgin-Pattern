package PrototypeCar;

public class Car implements Prototype {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public Prototype clone() {
        return new Car(model, color);
    }

    public void showCar() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }
    public void setModel(String model){
        this.model = model;
    }
}
