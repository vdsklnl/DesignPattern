package adapter.interfaceadapter;

/**
 * @author vdsklnl
 * @create 2022-06-27 10:56
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        ABSadapter adapter = new ABSadapter() {
            @Override
            public void m1() {
                System.out.println("使用方法一");
            }
        };
        adapter.m1();
    }
}
