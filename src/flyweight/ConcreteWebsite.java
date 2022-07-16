package flyweight;

/**
 * @author vdsklnl
 * @create 2022-07-04 20:52
 * @Description
 */

public class ConcreteWebsite extends Website {

    //共享部分，内部状态
    private String type = "";

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站类型：" + type + " 使用者：" + user.getName());
    }
}
