package DeepCopyCarGOF;


import  java.util.*;
public class PrototypeManager {
    private Map<String, IVehicle> registry;
    public PrototypeManager()  {
        registry = new HashMap<>();
        registry.put("Car", new Car("BMW X5",2500000,new Engine("BMW S58")));
        registry.put("Bike",  new Bike("Bajaj",100000,new Engine("CT100")));
    }
    public void addPrototype(String key, IVehicle v)
    {
        registry.put(key,v);
    }

    public void removePrototype(String key)
    {
        registry.remove(key);
    }
    public IVehicle getClone(String type) {
        return   registry.get(type).clone();

    }
}