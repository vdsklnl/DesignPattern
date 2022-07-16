package factory.abstractfactory.pizzastore.pizza;

/**
 * @author vdsklnl
 * @create 2022-06-21 14:29
 * @Description
 */

public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨准备材料：");
    }

}
