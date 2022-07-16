package adapter.objectadapter;

/**
 * @author vdsklnl
 * @create 2022-06-23 17:19
 * @Description
 */

public class Phone {
    //充电
    public void charging(DC dc) {
        if (dc.outputDC() == 5)
            System.out.println("电压5V，可以充电~");
        else
            System.out.println("电压异常，充电失败！");
    }
}
