package facade;

/**
 * @author vdsklnl
 * @create 2022-07-03 20:40
 * @Description
 */

public class Projector {
    private static volatile Projector projector;

    public Projector() {
    }

    public static Projector getInstance() {
        if (projector == null) {
            synchronized (Projector.class) {
                if (projector == null)
                    projector = new Projector();
            }
        }

        return projector;
    }

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void focus() {
        System.out.println("Projector focus");
    }
}
