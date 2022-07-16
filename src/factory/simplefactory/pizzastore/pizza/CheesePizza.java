package factory.simplefactory.pizzastore.pizza;

/**
 * @author vdsklnl
 * @create 2022-06-21 11:28
 * @Description
 */

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("奶酪披萨准备材料~");
    }

}
