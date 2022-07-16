package facade;

/**
 * @author vdsklnl
 * @create 2022-07-03 20:42
 * @Description
 */

public class Screen {
    private static Screen screen = new Screen();

    public static Screen getIstance() {
        return screen;
    }

    public void up() {
        System.out.println("Screen up");
    }

    public void down() {
        System.out.println("Screen down");
    }

}
