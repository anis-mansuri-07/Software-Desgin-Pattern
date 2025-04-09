package DeepCopyCarGOF;


public class Bike implements IVehicle{
    private String name;
    private int price;
    private Engine engine;

    public Bike(String name, int price, Engine engine) {
        this.name = name;
        this.price = price;
        this.engine = engine;
        try {
            System.out.println("Bike Features Loading...");
            Thread.sleep(3000);
            System.out.println("Bike Features Loaded now you are ready to go.");
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public Bike clone() {
        try {
            //shallow copy
            Bike clonedBike = (Bike)super.clone();
            //deep copy : you can write any logic as per your requirement
            clonedBike.engine = this.engine.clone();
            return clonedBike;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Bike Brand : "+name+" | Price : "+price+" | Engine : "+engine.show());
    }
    public int getHashCode(){
        return engine.hashCode();
    }
}
