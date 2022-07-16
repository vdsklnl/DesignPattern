package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vdsklnl
 * @create 2022-06-21 13:57
 * @Description
 */

public class OrderPizza2 {

    Pizza pizza = null;
    String orderType;

    public OrderPizza2() {
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            if (pizza != null) {
                this.pizza.setName(orderType);
                this.pizza.prepare();
                this.pizza.bake();
                this.pizza.cut();
                this.pizza.box();
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
