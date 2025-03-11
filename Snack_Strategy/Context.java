package Snack_Strategy;

public class Context {
    private ISnack snack;
    public void setSnack(ISnack snack){
        this.snack = snack;
    }
    public void setDetail(String type){
        snack.details(type);
    }
}
