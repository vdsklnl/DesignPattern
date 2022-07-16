package composite;

/**
 * @author vdsklnl
 * @create 2022-06-29 13:38
 * @Description
 */

public class Department extends OrganizationComposite {

    //最小单位，叶子节点，没有管理列表和权限，不需要重写对应方法

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
