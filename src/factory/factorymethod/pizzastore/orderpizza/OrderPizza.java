package factory.factorymethod.pizzastore.orderpizza;

import factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vdsklnl
 * @create 2022-06-21 14:37
 * @Description
 */

public abstract class OrderPizza {

    //定义抽象方法，让各子类工厂自己实现
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败！");
                break;
            }
        } while (true);
    }

    //获取顾客订购pizza种类
    private String getType() {
        String type;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input pizza type: ");
            type = br.readLine();
            return type;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
