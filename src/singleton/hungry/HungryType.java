package singleton.hungry;

/**
 * @author vdsklnl
 * @create 2022-06-17 21:37
 * @Description
 */

public class HungryType {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1：" + instance1.hashCode());
        System.out.println("instance2：" + instance2.hashCode());

        System.out.println("==================================");

        Singleton1 instance3 = Singleton1.getInstance();
        Singleton1 instance4 = Singleton1.getInstance();
        System.out.println("instance1：" + instance3.hashCode());
        System.out.println("instance2：" + instance4.hashCode());
    }
}

//饿汉式(静态变量)
class Singleton {

    private static final Singleton instance = new Singleton();

    //构造器私有化
    private Singleton() {}

    //提供静态方法，返回私有对象实例
    public static Singleton getInstance() {
        return instance;
    }

}

//饿汉式(静态代码块)
class Singleton1 {

    private static Singleton1 instance;

    //构造器私有化
    private Singleton1() {}

    //静态代码块
    static {
        instance = new Singleton1();
    }

    //提供静态方法，返回私有对象实例
    public static Singleton1 getInstance() {
        return instance;
    }

}
