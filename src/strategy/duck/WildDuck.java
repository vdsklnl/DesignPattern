package strategy.duck;

import strategy.fly.GoodFlyBehavior;

/**
 * @author vdsklnl
 * @create 2022-07-10 21:46
 * @Description
 */

public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("野鸭：");
    }
}
