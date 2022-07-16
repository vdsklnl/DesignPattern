package adapter.classadapter;

/**
 * @author vdsklnl
 * @create 2022-06-23 17:10
 * @Description
 */

//适配器类
public class VoltageAdapter extends AC implements DC {

    @Override
    public int outputDC() {
        int src = outputAC();
        int dst = src / 44;
        return dst;
    }

}
