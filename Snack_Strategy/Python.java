package Snack_Strategy;

public class Python implements ISnack{
    private IBiteBehavior iBiteBehavior;
    public Python() {
        this.iBiteBehavior = new NonPoison();
    }

    @Override
    public String details() {
        return "Python";
    }

    @Override
    public String performBite() {
        return iBiteBehavior.bite();
    }

    @Override
    public void setBehavior(IBiteBehavior behavior) {
        this.iBiteBehavior = behavior;
    }
}
