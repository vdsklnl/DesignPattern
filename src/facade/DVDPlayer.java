package facade;

/**
 * @author vdsklnl
 * @create 2022-07-03 20:24
 * @Description
 */

public class DVDPlayer {

    private static volatile DVDPlayer dvd;

    public DVDPlayer() {
    }

    public static DVDPlayer getInstance() {
        if (dvd == null) {
            synchronized (DVDPlayer.class) {
                if (dvd == null)
                    dvd = new DVDPlayer();
            }
        }

        return dvd;
    }

    public void on() {
        System.out.println("DVD on");
    }

    public void off() {
        System.out.println("DVD off");
    }

    public void play() {
        System.out.println("DVD playing");
    }

    public void pause() {
        System.out.println("DVD pause");
    }
}
