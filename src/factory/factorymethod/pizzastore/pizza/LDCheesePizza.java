package factory.factorymethod.pizzastore.pizza;

/**
 * @author vdsklnl
 * @create 2022-06-21 14:26
 * @Description
 */

public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨准备材料：");
    }

}
