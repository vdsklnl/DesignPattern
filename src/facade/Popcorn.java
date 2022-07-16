package facade;

/**
 * @author vdsklnl
 * @create 2022-07-03 20:31
 * @Description
 */

public class Popcorn {
    private static volatile Popcorn popcorn;

    public Popcorn() {
    }

    public static Popcorn getInstance() {
        if (popcorn == null) {
            synchronized (Popcorn.class) {
                if (popcorn == null)
                    popcorn = new Popcorn();
            }
        }

        return popcorn;
    }

    public void on() {
        System.out.println("Popcorn on");
    }

    public void off() {
        System.out.println("Popcorn off");
    }

    public void pop() {
        System.out.println("Popcorn popping");
    }
}
