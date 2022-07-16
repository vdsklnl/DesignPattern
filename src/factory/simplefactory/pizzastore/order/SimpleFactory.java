package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.PepperPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author vdsklnl
 * @create 2022-06-19 21:30
 * @Description
 */

public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂订购披萨：");
        Pizza pizza = null;
        if (orderType.equals("greek"))
            pizza = new GreekPizza();
        else if (orderType.equals("cheese"))
            pizza = new CheesePizza();
        else if (orderType.equals("pepper"))
            pizza = new PepperPizza();
        return pizza;
    }

    public static Pizza createPizza2(String orderType) {
        System.out.println("使用简单工厂订购披萨：");
        Pizza pizza = null;
        if (orderType.equals("greek"))
            pizza = new GreekPizza();
        else if (orderType.equals("cheese"))
            pizza = new CheesePizza();
        else if (orderType.equals("pepper"))
            pizza = new PepperPizza();
        return pizza;
    }

}
