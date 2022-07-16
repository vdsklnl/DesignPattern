package strategy.duck;

import strategy.fly.NoFlyBehavior;

/**
 * @author vdsklnl
 * @create 2022-07-10 21:48
 * @Description
 */

public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭：");
    }
}
