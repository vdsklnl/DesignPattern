package decorator.client;

import decorator.coffee.Decoffee;
import decorator.coffee.Drink;
import decorator.coffee.Longblack;
import decorator.ingredient.Chocolate;
import decorator.ingredient.Milk;
import decorator.ingredient.Soy;

/**
 * @author vdsklnl
 * @create 2022-06-29 11:22
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        //完成咖啡订单：美式咖啡+牛奶+巧克力*2
        Drink order1 = new Longblack();
        System.out.println("order1：美式咖啡");
        System.out.println(order1.getDes() + "：总价" + order1.cost());
        //加牛奶
        order1 = new Milk(order1);
        System.out.println(order1.getDes() + "：总价" + order1.cost());
        //加巧克力
        order1 = new Chocolate(order1);
        System.out.println(order1.getDes() + "：总价" + order1.cost());
        //加巧克力
        order1 = new Chocolate(order1);
        System.out.println(order1.getDes() + "：总价" + order1.cost());

        System.out.println("===========================");

        //拓展：订单2，无因咖啡+牛奶+豆浆
        Drink order2 = new Decoffee();
        System.out.println("order2：无因咖啡");
        System.out.println(order2.getDes() + "：总价" + order2.cost());
        //加牛奶
        order2 = new Milk(order2);
        System.out.println(order2.getDes() + "：总价" + order2.cost());
        //加豆浆
        order2 = new Soy(order2);
        System.out.println(order2.getDes() + "：总价" + order2.cost());
    }
}
