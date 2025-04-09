package ShallowGameGOF;
import  java.util.*;
public class PrototypeManager {
   private Map<String,IGame> registry;
   public PrototypeManager()  {
          registry = new HashMap<>();
         registry.put("GameCharacter", new GameCharacter("Carlson","Archer",500));
         registry.put("GameWeapon",  new GameWeapon("Special Sword","Sword",70));
    }
    public void addPrototype(String key,IGame ig)
    {
        registry.put(key,ig);
    }

    public void removePrototype(String key)
    {
        registry.remove(key);
    }
    public IGame getClone(String type) {
      return   registry.get(type).clone();

    }
}
