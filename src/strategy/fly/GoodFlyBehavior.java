package strategy.fly;

/**
 * @author vdsklnl
 * @create 2022-07-10 21:41
 * @Description
 */

public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术高超！");
    }
}
