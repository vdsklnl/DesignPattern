package decorator.ingredient;

import decorator.coffee.Drink;

/**
 * @author vdsklnl
 * @create 2022-06-29 11:22
 * @Description
 */

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(1.5f);
    }
}
