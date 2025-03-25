package PrototypeGOF;

// Step 1: Prototype Interface (as per GoF Design Pattern)
interface GameCharacter extends Cloneable {
    GameCharacter clone();  // Prototype method
    void attack();
    void showCharacter();
}

// Step 2: Concrete Prototype 1: Warrior
class Warrior implements GameCharacter {
    private String name;
    private int health;
    private int attackPower;

    public Warrior(String name) {
        this.name = name;
        this.health = 150;
        this.attackPower = 20;
    }

    @Override
    public GameCharacter clone() {
        return new Warrior(this.name); // Creating a new object (Shallow Copy)
    }

    @Override
    public void attack() {
        System.out.println(name + " swings a sword!");
    }

    @Override
    public void showCharacter() {
        System.out.println("Character: " + name + " [HP: " + health + ", Attack: " + attackPower + "]");
    }
}

// Step 3: Concrete Prototype 2: Mage
class Mage implements GameCharacter {
    private String name;
    private int health;
    private int attackPower;

    public Mage(String name) {
        this.name = name;
        this.health = 100;
        this.attackPower = 30;
    }

    @Override
    public GameCharacter clone() {
        return new Mage(this.name);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a fireball!");
    }

    @Override
    public void showCharacter() {
        System.out.println("Character: " + name + " [HP: " + health + ", Attack: " + attackPower + "]");
    }
}

// Step 4: Concrete Prototype 3: Archer
class Archer implements GameCharacter {
    private String name;
    private int health;
    private int attackPower;

    public Archer(String name) {
        this.name = name;
        this.health = 120;
        this.attackPower = 25;
    }

    @Override
    public GameCharacter clone() {
        return new Archer(this.name);
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots an arrow!");
    }

    @Override
    public void showCharacter() {
        System.out.println("Character: " + name + " [HP: " + health + ", Attack: " + attackPower + "]");
    }
}

// Step 5: Client Class - Game Prototype Demo
public class GamePrototype {
    public static void main(String[] args) {
        // Creating Prototype Characters
        GameCharacter warriorPrototype = new Warrior("Warrior");
        GameCharacter magePrototype = new Mage("Mage");
        GameCharacter archerPrototype = new Archer("Archer");

        // Cloning Characters using Prototype Pattern
        GameCharacter clonedWarrior = warriorPrototype.clone();
        GameCharacter clonedMage = magePrototype.clone();
        GameCharacter clonedArcher = archerPrototype.clone();

        // Renaming Cloned Characters for Variation
//        ((Warrior) clonedWarrior).clone(); // Cloning again (optional)
//        ((Mage) clonedMage).clone();
//        ((Archer) clonedArcher).clone();

        // Displaying Cloned Characters
        warriorPrototype.showCharacter(); // Warrior [HP: 150, Attack: 20]
        clonedWarrior.showCharacter();    // Warrior [HP: 150, Attack: 20]
        warriorPrototype.attack();        // Warrior swings a sword!
        clonedWarrior.attack();           // Warrior swings a sword!

        magePrototype.showCharacter();    // Mage [HP: 100, Attack: 30]
        clonedMage.showCharacter();       // Mage [HP: 100, Attack: 30]
        magePrototype.attack();           // Mage casts a fireball!
        clonedMage.attack();              // Mage casts a fireball!

        archerPrototype.showCharacter();  // Archer [HP: 120, Attack: 25]
        clonedArcher.showCharacter();     // Archer [HP: 120, Attack: 25]
        archerPrototype.attack();         // Archer shoots an arrow!
        clonedArcher.attack();            // Archer shoots an arrow!
    }
}
