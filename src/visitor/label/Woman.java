package visitor.label;

import visitor.action.Action;

/**
 * @author vdsklnl
 * @create 2022-07-06 21:12
 * @Description 双分派思想：
 *                  先将操作作为参数传递给对象
 *                  再将对象自己作为参数传递给调用方法
 */

public class Woman extends People {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
