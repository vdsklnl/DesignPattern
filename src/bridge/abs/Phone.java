package bridge.abs;

import bridge.imple.Brand;

/**
 * @author vdsklnl
 * @create 2022-06-27 12:14
 * @Description
 */

public abstract class Phone {
    //组合品牌
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        this.brand.open();
    }

    public void close() {
        this.brand.close();
    }

    public void call() {
        this.brand.call();
    }
}
