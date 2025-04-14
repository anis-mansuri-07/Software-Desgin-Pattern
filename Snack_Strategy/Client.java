package Snack_Strategy;

public class Client {
    public static void main(String[] args) {

        ISnack python = new Python();
        ISnack cobra = new Cobra();

        System.out.println(python.details());
        System.out.println(python.performBite());

        System.out.println("This time non Poison Initially");

        python.setBehavior(new Poison());

        System.out.println(python.details());
        System.out.println(python.performBite());
    }
}
