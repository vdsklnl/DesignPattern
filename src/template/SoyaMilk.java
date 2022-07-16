package template;

/**
 * @author vdsklnl
 * @create 2022-07-06 14:04
 * @Description
 */

public abstract class SoyaMilk {
    //模板方法，做成final禁止子类覆盖
    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    void select() {
        System.out.println("挑选新鲜黄豆");
    }

    abstract void addCondiments(); //交由子类实现

    void soak() {
        System.out.println("浸泡黄豆和配料");
    }

    void beat() {
        System.out.println("打碎黄豆和配料");
    }
}
