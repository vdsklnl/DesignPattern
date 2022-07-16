package factory.abstractfactory.pizzastore.orderpizza;

import factory.abstractfactory.pizzastore.factory.AbsFactory;
import factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vdsklnl
 * @create 2022-06-21 15:27
 * @Description
 */

public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    public void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
            pizza = this.absFactory.createPizza(orderType);
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
