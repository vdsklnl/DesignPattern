package factory.factorymethod.pizzastore.pizza;

/**
 * @author vdsklnl
 * @create 2022-06-21 14:29
 * @Description
 */

public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨准备材料：");
    }

}
