package visitor.action;

import visitor.label.Man;
import visitor.label.Woman;

/**
 * @author vdsklnl
 * @create 2022-07-06 21:09
 * @Description
 */

public abstract class Action {
    //得到不同类人的测评结果
    public abstract void getManResult(Man man);
    public abstract void getWomanResult(Woman woman);
}
