package command.light;

import command.Command;

/**
 * @author vdsklnl
 * @create 2022-07-06 20:01
 * @Description 没有操作，空执行，初始化每个按钮
 *              省掉对空判断
 */

public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
