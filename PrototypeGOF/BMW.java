package PrototypeGOF;

public class BMW implements ICar_Prototype{

    private String model;
    private String color;
    private int price;

    public BMW(String model,String color,int price) {
        this.model = model;
        this.color = color;
        this.price = price;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    void show(){
        System.out.println("Model : "+this.model+" Color : "+this.color+" Price : "+this.price);
    }

    @Override
    public ICar_Prototype clone() {
        try {
            return (ICar_Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
