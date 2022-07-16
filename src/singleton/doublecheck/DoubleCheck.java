package singleton.doublecheck;

/**
 * @author vdsklnl
 * @create 2022-06-18 21:05
 * @Description
 */

public class DoubleCheck {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1：" + instance1.hashCode());
        System.out.println("instance2：" + instance2.hashCode());
    }
}

//双重检查(同步代码块)
class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
