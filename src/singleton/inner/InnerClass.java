package singleton.inner;

/**
 * @author vdsklnl
 * @create 2022-06-18 21:13
 * @Description
 */

public class InnerClass {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1：" + instance1.hashCode());
        System.out.println("instance2：" + instance2.hashCode());
    }
}

//静态内部类
class Singleton {
    private Singleton() {}

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
