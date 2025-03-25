package PrototypeGOF;



public class PrototypePatternDemo {
    public static void main(String[] args) {

            BMW bmw = new BMW("BMW-X5","White",9500000);
            bmw.show();

            BMW bmw1 = new BMW("BMW-M3","Red",1000000);
            bmw1.show();


            BMW bmw2 = (BMW) bmw.clone();
            bmw2.setModel("BMW-C5");
            bmw2.show();




    }
}

