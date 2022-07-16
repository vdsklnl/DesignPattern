package factory.abstractfactory.pizzastore.pizza;

/**
 * @author vdsklnl
 * @create 2022-06-21 14:26
 * @Description
 */

public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨准备材料：");
    }

}
