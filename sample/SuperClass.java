package sample;

class Me{
    public Me(){
        System.out.println("ME Class");
    }
}
class Parent extends Me{
    public Parent(){
        System.out.println("This Is Parent Class " + this.hashCode());
    }
}

class Child extends Parent{
    public Child(){

        System.out.println("This Is Child Class " + this.hashCode());
    }
}
public class SuperClass {
    public static void main(String[] args) {

        Child ch2 = new Child();

        System.out.println(ch2.hashCode());
    }
}
