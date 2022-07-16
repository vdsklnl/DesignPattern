package strategy.fly;

/**
 * @author vdsklnl
 * @create 2022-07-10 21:41
 * @Description
 */

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("根本不会飞翔！");
    }
}
