package decorator.ingredient;

import decorator.coffee.Drink;

/**
 * @author vdsklnl
 * @create 2022-06-29 11:23
 * @Description
 */

public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(2.5f);
    }
}
