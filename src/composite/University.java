package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vdsklnl
 * @create 2022-06-29 13:29
 * @Description 非叶子节点，大学，对学院进行管理
 */

public class University extends OrganizationComposite {

    //管理学院
    List<OrganizationComposite> list = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComposite oc) {
        list.add(oc);
    }

    @Override
    protected void remove(OrganizationComposite oc) {
        list.remove(oc);
    }

    @Override
    protected void print() {
        System.out.println("========" + getName() + "========");
        for (OrganizationComposite oc:list) {
            oc.print();
        }
    }
}
