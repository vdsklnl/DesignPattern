package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vdsklnl
 * @create 2022-06-21 11:30
 * @Description
 */

public class OrderPizza {
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do {
//            orderType = getType();
//            if (orderType.equals("greek"))
//                pizza = new GreekPizza();
//            else if (orderType.equals("cheese"))
//                pizza = new CheesePizza();
//            else
//                break;
//            pizza.setName(orderType);
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    //简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        String orderType = "";
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
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
