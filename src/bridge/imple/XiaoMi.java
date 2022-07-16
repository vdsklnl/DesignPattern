package bridge.imple;

/**
 * @author vdsklnl
 * @create 2022-06-27 12:11
 * @Description
 */

public class XiaoMi implements Brand {

    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
