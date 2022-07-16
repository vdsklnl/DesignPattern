package prototype.deepclone;

/**
 * @author vdsklnl
 * @create 2022-06-22 14:07
 * @Description
 */

public class Client {
    public static void main(String[] args) throws Exception {
        DeepPrototype deep = new DeepPrototype();
        deep.name = "宋江";
        deep.deepCloneableTarget = new DeepCloneableTarget("天魁星", "呼保义");

        //方式一
        DeepPrototype clone = (DeepPrototype) deep.clone();

        //方式二
        DeepPrototype clone1 = (DeepPrototype) deep.deepClone();

        System.out.println(deep);
        System.out.println(clone);
        System.out.println(clone1);
    }
}
