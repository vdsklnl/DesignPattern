package factory.abstractfactory.pizzastore.factory;

import factory.abstractfactory.pizzastore.pizza.*;

/**
 * @author vdsklnl
 * @create 2022-06-21 15:23
 * @Description
 */

public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂订购披萨：");
        Pizza pizza = null;
        if (orderType.equals("cheese"))
            pizza = new LDCheesePizza();
        else if (orderType.equals("pepper"))
            pizza = new LDPepperPizza();
        return pizza;
    }

}
