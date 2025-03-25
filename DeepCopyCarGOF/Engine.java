package DeepCopyCarGOF;

public class Engine implements Cloneable{
    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    @Override
    //this  is for deep cloning
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public String show(){
        return engineType;
    }
}
