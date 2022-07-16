package adapter.objectadapter;

/**
 * @author vdsklnl
 * @create 2022-06-23 17:10
 * @Description
 */

//适配器类
public class VoltageAdapter implements DC {

    private AC ac;

    public VoltageAdapter(AC ac) {
        this.ac = ac;
    }

    @Override
    public int outputDC() {
        int dst = 0;
        if (null != ac) {
            int src = ac.outputAC();
            System.out.println("使用对象适配器模式进行适配：");
            dst = src / 44;
            System.out.println("适配完成，输出电压：" + dst);
        }
        return dst;
    }

}
