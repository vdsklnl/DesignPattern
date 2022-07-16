package facade;

/**
 * @author vdsklnl
 * @create 2022-07-03 20:46
 * @Description
 */

public class TheaterLight {

    private static TheaterLight theaterLight = new TheaterLight();

    public static TheaterLight getInstance() {
        return theaterLight;
    }

    public void on() {
        System.out.println("Light on");
    }

    public void off() {
        System.out.println("Light off");
    }

    public void up() {
        System.out.println("Light up");
    }

    public void down() {
        System.out.println("Light down");
    }
}
