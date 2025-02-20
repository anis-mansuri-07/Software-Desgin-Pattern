package Facade;

public class Facade_Client {
    public static void main(String[] args) {
    HomeTheater homeTheater = new HomeTheater();
    homeTheater.watchMovie();
    homeTheater.endMovie();
    }
}
