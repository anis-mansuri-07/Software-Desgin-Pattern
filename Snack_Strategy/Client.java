package Snack_Strategy;

public class Client {
    public static void main(String[] args) {
        Context c = new Context();
        c.setSnack(new Cobra());
        c.setDetail("Poison");
        c.setDetail("Non Poison");
    }
}
