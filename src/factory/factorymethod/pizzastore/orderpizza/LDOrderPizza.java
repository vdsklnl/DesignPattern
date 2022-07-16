package factory.factorymethod.pizzastore.orderpizza;

import factory.factorymethod.pizzastore.pizza.*;

/**
 * @author vdsklnl
 * @create 2022-06-21 15:10
 * @Description
 */

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        System.out.println("使用工厂方法订购披萨：");
        Pizza pizza = null;
        if (orderType.equals("cheese"))
            pizza = new LDCheesePizza();
        else if (orderType.equals("pepper"))
            pizza = new LDPepperPizza();
        return pizza;
    }

}
