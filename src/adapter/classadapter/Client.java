package adapter.classadapter;

/**
 * @author vdsklnl
 * @create 2022-06-23 17:28
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
