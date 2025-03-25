package DeepCopyCarGOF;


public class Bike implements IVehicle{
    private String brand;
    private int price;
    private Engine engine;

    public Bike(String brand, int price, Engine engine) {
        this.brand = brand;
        this.price = price;
        this.engine = engine;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public Bike clone() {
        try {
            //shallow copy
            Bike clonedBike = (Bike)super.clone();
            //deep copy
            clonedBike.engine = this.engine.clone();
            return clonedBike;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Bike Brand : "+brand+" | Price : "+price+" | Engine : "+engine.show());
    }
    public int getHashCode(){
        return engine.hashCode();
    }
}
