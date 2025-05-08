package Abs_Fact_Assign;
public class IndianFactory extends AbstractFactory {
    public Maincourse getMaincourse()
    {
        return new IndianMaincourse();
    }
    public Desserts getdesserts()
    {
      return new IndianDesserts();
    }
    public Appetizers getappetizers()
    {
        return  new IndianAppetizer();
    }
}
