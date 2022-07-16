package factory.abstractfactory.pizzastore.factory;

import factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author vdsklnl
 * @create 2022-06-21 15:22
 * @Description
 */

public interface AbsFactory {
    //让工厂子类实现
    public Pizza createPizza(String orderType);
}
