package visitor.action;

import visitor.label.Man;
import visitor.label.Woman;

/**
 * @author vdsklnl
 * @create 2022-07-06 21:13
 * @Description
 */

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人评价歌手失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人评价歌手失败");
    }
}
