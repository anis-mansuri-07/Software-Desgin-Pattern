package ShallowGameGOF;

public class ClientTwo {

    public static void main(String[] args){

        System.out.println("First Time For Manager To Load Character and Weapon");
        PrototypeManager prototypeManager = new PrototypeManager();

        System.out.println("First Time Clone Character");
        GameCharacter gameCharacter1 = (GameCharacter) prototypeManager.getClone("GameCharacter");
        gameCharacter1.setCharHealth(10);
        gameCharacter1.showAttributes();

        System.out.println("Second Time Clone Character");
        GameCharacter gameCharacter2 = (GameCharacter) prototypeManager.getClone("GameCharacter");
        gameCharacter2.setCharHealth(50);
        gameCharacter2.showAttributes();




    }
}
