package adapter.objectadapter;

/**
 * @author vdsklnl
 * @create 2022-06-23 17:05
 * @Description
 */

//被适配类
public class AC {
    public int outputAC() {
        int src = 220;
        System.out.println("电压 = " + src + " V");
        return src;
    }
}
