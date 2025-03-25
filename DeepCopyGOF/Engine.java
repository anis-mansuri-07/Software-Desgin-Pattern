package DeepCopyGOF;

public class Engine implements Cloneable {
    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    // Deep Copy: Creates a new Engine instance instead of sharing reference
    @Override
    protected Engine clone() {
        return new Engine(this.type, this.horsepower);
    }

    public void showEngine() {
        System.out.println("Engine Type: " + type + " [Horsepower: " + horsepower + " HP]");
    }
}
