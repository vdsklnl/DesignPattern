package decorator.ingredient;

import decorator.coffee.Drink;

/**
 * @author vdsklnl
 * @create 2022-06-29 11:12
 * @Description 装饰者，在星巴克订单项目中为调料
 */

public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        //输出被装饰者信息
        return des + " " + getPrice() + " && " + drink.getDes();
    }
}
