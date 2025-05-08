package Abs_Fact_Assign;

public abstract class AbstractFactory {
    public  abstract Maincourse getMaincourse();
    public  abstract Desserts getdesserts();
    public  abstract Appetizers getappetizers();

    public static AbstractFactory getFactory(String cuisine)
    {
         if(cuisine.equalsIgnoreCase("Indian"))
         {
            return new IndianFactory();
         }
         else if (cuisine.equalsIgnoreCase("chinese")) {
            return new ChineseFactory();
         }
         else
         {
            throw new IllegalAccessError("Enter only Indian or Chinese Cuisine");
         }
         
    }
}
