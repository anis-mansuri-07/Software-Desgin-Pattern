package DeepCopyCarGOF;

public class Car implements IVehicle{
    private String brand;
    private int price;
    private Engine engine;

    public Car(String brand, int price, Engine engine) {
        this.brand = brand;
        this.price = price;
        this.engine = engine;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        try {
            //shallow copy
            Car clonedCar = (Car)super.clone();
            //deep copy
            clonedCar.engine = this.engine.clone();
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Car Brand : "+brand+" | Price : "+price+" | Engine : "+engine.show());
    }
    public int getHashCode(){
        return engine.hashCode();
    }
}
