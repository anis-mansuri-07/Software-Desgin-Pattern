package DeepCopyCarGOF;

public class Car implements IVehicle{
    private String name;
    private int price;
    private Engine engine;

    public Car(String name, int price, Engine engine) {
        this.name = name;
        this.price = price;
        this.engine = engine;
        try {

            System.out.println("Car Features Loading...");
            Thread.sleep(3000);
            System.out.println("Car Features Loaded now you are ready to go.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        System.out.println("Car Brand : "+ name +" | Price : "+price+" | Engine : "+engine.show());
    }
    public int getHashCode(){
        return engine.hashCode();
    }
}
