package strategy;

import strategy.duck.ToyDuck;
import strategy.duck.WildDuck;

/**
 * @author vdsklnl
 * @create 2022-07-10 21:50
 * @Description
 */

public class ClientTest {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
    }
}
