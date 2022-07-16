package factory.simplefactory.pizzastore.store;

import factory.factorymethod.pizzastore.orderpizza.BJOrderPizza;
import factory.factorymethod.pizzastore.orderpizza.LDOrderPizza;

/**
 * @author vdsklnl
 * @create 2022-06-21 15:14
 * @Description
 */

public class PizzaStore {
    public static void main(String[] args) {
//        new BJOrderPizza();
        new LDOrderPizza();
        System.out.println("退出程序");
    }
}
