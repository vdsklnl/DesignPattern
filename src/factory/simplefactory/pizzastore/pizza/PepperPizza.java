package factory.simplefactory.pizzastore.pizza;

/**
 * @author vdsklnl
 * @create 2022-06-21 13:41
 * @Description
 */

public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("胡椒披萨准备材料~");
    }
}
