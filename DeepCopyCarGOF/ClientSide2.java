package DeepCopyCarGOF;

public class ClientSide2 {

    public static void main(String[] args) {
        PrototypeManager prototypeManager = new PrototypeManager();
        System.out.println("First Time Clone Car");
        Car car1 = (Car) prototypeManager.getClone("Car");
        car1.setName("AUDI");

        System.out.println("Second Time Clone Car");
        Car car2 = (Car) prototypeManager.getClone("Car");
        car2.setName("JAGUAR");

        System.out.println("Now Check Both Are Same Or Not");
        System.out.println(car1.getHashCode()==car2.getHashCode());
    }
}
