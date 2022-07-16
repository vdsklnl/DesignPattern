package visitor.label;

import visitor.action.Action;

/**
 * @author vdsklnl
 * @create 2022-07-06 21:12
 * @Description
 */

public class Man extends People {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
