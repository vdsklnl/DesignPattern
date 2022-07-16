package bridge.abs;

import bridge.imple.Brand;

/**
 * @author vdsklnl
 * @create 2022-06-27 12:17
 * @Description
 */

public class Folder extends Phone {

    public Folder(Brand brand) {
        super(brand);
    }

    public void open() {
        System.out.println("折叠式手机");
        super.open();
    }

    public void close() {
        System.out.println("折叠式手机");
        super.close();
    }

    public void call() {
        System.out.println("折叠式手机");
        super.call();
    }
}
