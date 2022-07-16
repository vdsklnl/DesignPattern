package strategy.duck;

import strategy.fly.FlyBehavior;

/**
 * @author vdsklnl
 * @create 2022-07-10 21:44
 * @Description
 */

public abstract class Duck {
    //策略接口
    FlyBehavior flyBehavior;

    public Duck() {

    }

    public abstract void display(); //显示基本信息

    public void fly() {
        if (flyBehavior != null)
            flyBehavior.fly();
    }
}
