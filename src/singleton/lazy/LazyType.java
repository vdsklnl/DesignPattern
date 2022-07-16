package singleton.lazy;

/**
 * @author vdsklnl
 * @create 2022-06-18 20:43
 * @Description
 */

public class LazyType {
    public static void main(String[] args) {
        Singleton1 instance3 = Singleton1.getInstance();
        Singleton1 instance4 = Singleton1.getInstance();
        System.out.println("instance1：" + instance3.hashCode());
        System.out.println("instance2：" + instance4.hashCode());

        System.out.println("==================================");

        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println("instance1：" + instance1.hashCode());
        System.out.println("instance2：" + instance2.hashCode());

    }
}

//懒汉式(线程不安全)
class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null)
            instance = new Singleton1();
        return instance;
    }
}

//懒汉式(线程安全，同步方法)
class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null)
            instance = new Singleton2();
        return instance;
    }
}