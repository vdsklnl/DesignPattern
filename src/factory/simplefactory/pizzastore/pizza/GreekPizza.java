package factory.simplefactory.pizzastore.pizza;

/**
 * @author vdsklnl
 * @create 2022-06-21 11:29
 * @Description
 */

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("希腊披萨准备材料~");
    }

}
