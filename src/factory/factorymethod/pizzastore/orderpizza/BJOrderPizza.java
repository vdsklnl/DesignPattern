package factory.factorymethod.pizzastore.orderpizza;

import factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author vdsklnl
 * @create 2022-06-21 15:05
 * @Description
 */

public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        System.out.println("使用工厂方法订购披萨：");
        Pizza pizza = null;
        if (orderType.equals("cheese"))
            pizza = new BJCheesePizza();
        else if (orderType.equals("pepper"))
            pizza = new BJPepperPizza();
        return pizza;
    }

}
