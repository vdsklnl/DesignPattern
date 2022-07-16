package factory.abstractfactory.pizzastore.factory;

import factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author vdsklnl
 * @create 2022-06-21 15:23
 * @Description
 */

public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂订购披萨：");
        Pizza pizza = null;
        if (orderType.equals("cheese"))
            pizza = new BJCheesePizza();
        else if (orderType.equals("pepper"))
            pizza = new BJPepperPizza();
        return pizza;
    }

}
