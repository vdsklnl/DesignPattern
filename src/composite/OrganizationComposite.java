package composite;

/**
 * @author vdsklnl
 * @create 2022-06-29 13:24
 * @Description
 */

public abstract class OrganizationComposite {
    private String name;
    private String des;

    public OrganizationComposite(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    //方法默认实现，叶子节点不需要重写对应方法
    protected void add(OrganizationComposite oc) {
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComposite oc) {
        throw new UnsupportedOperationException();
    }

    //打印，均需要重写
    protected abstract void print();
}
