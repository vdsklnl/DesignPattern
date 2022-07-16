package singleton.enumclass;

/**
 * @author vdsklnl
 * @create 2022-06-18 21:21
 * @Description
 */

public class EnumTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println("instance1：" + instance1.hashCode());
        System.out.println("instance2：" + instance2.hashCode());
    }
}

//使用枚举类(JDK5.0)
enum Singleton {

    INSTANCE;

    public void method() {

    }
}
