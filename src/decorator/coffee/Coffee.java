package decorator.coffee;

/**
 * @author vdsklnl
 * @create 2022-06-29 11:03
 * @Description
 */

public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
