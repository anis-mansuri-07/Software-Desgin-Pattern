package ShallowGameGOF;

public class GamerClient {
    public static void main(String[] args) {
        System.out.println("First Time For Character");

        IGame gameCharacter = new GameCharacter("Draven","Warrior",100);
        System.out.println("Before Clone: Original");
        gameCharacter.showAttributes();

        System.out.println("After Clone: Copy");
        GameCharacter gameCharacter1 = (GameCharacter) gameCharacter.clone();
        gameCharacter1.setCharHealth(120);
        gameCharacter1.showAttributes();


        System.out.println("---------------------------------------------------------------------");
        System.out.println("First Time For Weapon");

        IGame gameWeapon = new GameWeapon("ShadowFang","Sword",80);
        System.out.println("Before Clone: Original");
        gameWeapon.showAttributes();


        System.out.println("After Clone: Copy");
        GameWeapon gameWeapon1 = (GameWeapon) gameWeapon.clone();
        gameWeapon1.setWeaponDamage(90);
        gameWeapon1.showAttributes();

        //System.out.println(((GameWeapon) gameWeapon).sampleForDeepCopy.hashCode()==gameWeapon1.sampleForDeepCopy.hashCode());



    }
}
