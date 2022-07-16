package factory.abstractfactory.pizzastore.store;


import factory.abstractfactory.pizzastore.factory.BJFactory;
import factory.abstractfactory.pizzastore.orderpizza.OrderPizza;

/**
 * @author vdsklnl
 * @create 2022-06-21 15:30
 * @Description
 */

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
        System.out.println("退出程序");
    }
}
