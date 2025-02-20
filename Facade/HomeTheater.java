package Facade;

public class HomeTheater {
    private final TV tv;
    private final Sound_System sound;
    private final Dvd_Player  dvd;

    public HomeTheater() {
        this.tv = new TV();
        this.sound = new Sound_System();
        this.dvd = new Dvd_Player();
    }

    public void watchMovie(){
        System.out.println("Starting Movie Mode...");
        tv.tvOn();
        sound.setVolume(10);
        dvd.playMovie();
    }
    public void endMovie(){
        System.out.println("Shutting Down Movie Mode...");
        tv.tvOff();

    }
}
