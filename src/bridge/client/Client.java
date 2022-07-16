package bridge.client;

import bridge.abs.Folder;
import bridge.abs.Phone;
import bridge.abs.UpRight;
import bridge.imple.Vivo;
import bridge.imple.XiaoMi;

/**
 * @author vdsklnl
 * @create 2022-06-27 12:19
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        //测试
        Phone miF = new Folder(new XiaoMi());
        miF.open();
        miF.call();
        miF.close();

        System.out.println("=================");
        Phone vivoF = new Folder(new Vivo());
        vivoF.open();
        vivoF.call();
        vivoF.close();

        System.out.println("=================");
        Phone miU = new UpRight(new XiaoMi());
        miU.open();
        miU.call();
        miU.close();

        System.out.println("=================");
        Phone vivoU = new UpRight(new Vivo());
        vivoU.open();
        vivoU.call();
        vivoU.close();

    }
}
