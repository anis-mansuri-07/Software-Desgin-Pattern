package Snack_Strategy;

public class Cobra implements ISnack{
    @Override
    public void details(String type) {
        System.out.println("Cobra Type: " + type);
    }
}
