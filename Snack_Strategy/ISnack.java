package Snack_Strategy;

public interface ISnack {
    String details();
    String performBite();
    void setBehavior(IBiteBehavior behavior);
}
