package bridge.imple;

/**
 * @author vdsklnl
 * @create 2022-06-27 12:12
 * @Description
 */

public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }
}
