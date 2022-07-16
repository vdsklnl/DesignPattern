package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vdsklnl
 * @create 2022-06-29 13:35
 * @Description
 */

public class College extends OrganizationComposite {

    //管理院系
    List<OrganizationComposite> list = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    //需要重写，以应对不同业务逻辑
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
        System.out.println("--------" + getName() + "--------");
        for (OrganizationComposite oc:list) {
            oc.print();
        }
    }
}
