package Abs_Fact_Assign;
public class ChineseFactory extends AbstractFactory {
    public Maincourse getMaincourse()
    {
        return new ChineseMainCourse();
    }
    public Desserts getdesserts()
    {
      return new ChineseDesserts();
    }
    public Appetizers getappetizers()
    {
        return  new ChineseAppetizers();
    }

}
