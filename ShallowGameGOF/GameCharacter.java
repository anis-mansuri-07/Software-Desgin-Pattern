package ShallowGameGOF;

public class GameCharacter implements IGame{
    private String charName;
    private String charType;
    private int charHealth;

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getCharType() {
        return charType;
    }

    public void setCharType(String charType) {
        this.charType = charType;
    }

    public int getCharHealth() {
        return charHealth;
    }

    public void setCharHealth(int charHealth) {
        this.charHealth = charHealth;
    }


//    public  GameCharacter(){}
    //Time Consuming Part While Creating Object
    public GameCharacter(String charName, String charType, int charHealth){
        this.charName = charName;
        this.charType = charType;
        this.charHealth = charHealth;
        try {
            System.out.println("Character Loading...");
            Thread.sleep(3000);
            System.out.println("Character Loaded now you are ready to go");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // cloning of the object
    @Override
    public GameCharacter clone() {
        try {
            return (GameCharacter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void showAttributes() {
        System.out.println("Character Name : "+ this.charName+" | Type : " +this.charType +" | Health : "+this.charHealth);
    }
}
