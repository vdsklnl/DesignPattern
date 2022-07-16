package proxy.dynamicproxy;

/**
 * @author vdsklnl
 * @create 2022-07-04 21:46
 * @Description
 */

public class TeacherDao implements ITeacherDao {
    //被代理类

    @Override
    public void teach() {
        System.out.println("老师授课中~~");
    }

    @Override
    public void hello(String name) {
        System.out.println("Hello, " + name);
    }
}
