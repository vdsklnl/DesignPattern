package decorator.ingredient;

import decorator.coffee.Drink;

/**
 * @author vdsklnl
 * @create 2022-06-29 11:20
 * @Description
 */

public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(2.0f);
    }

}
