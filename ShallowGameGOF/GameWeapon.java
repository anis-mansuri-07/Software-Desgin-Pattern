package ShallowGameGOF;

public class GameWeapon implements IGame{

    private String weaponName;
    private String weaponType;
    private int weaponDamage;

    // to check deep copy
    //SampleForDeepCopy sampleForDeepCopy = new SampleForDeepCopy();

    public GameWeapon(String weaponName,String weaponType,int weaponDamage){
        this.weaponName = weaponName;
        this.weaponType = weaponType;
        this.weaponDamage = weaponDamage;
        try {
            System.out.println("Weapon Loading...");
            Thread.sleep(3000);
            System.out.println("Weapon Loaded now you are ready to go");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    @Override
    public GameWeapon clone() {
        try {
            return (GameWeapon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void showAttributes() {
        System.out.println("Weapon Name : "+ this.weaponName+" | Type : " +this.weaponType +" | Damage : "+this.weaponDamage);
    }
}
