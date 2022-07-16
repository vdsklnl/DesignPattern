package template;

/**
 * @author vdsklnl
 * @create 2022-07-06 14:11
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        System.out.println("----红豆豆浆----");
        SoyaMilk redBean = new RedBean();
        redBean.make();
        System.out.println("----花生豆浆----");
        SoyaMilk peanut = new Peanut();
        peanut.make();
    }
}
