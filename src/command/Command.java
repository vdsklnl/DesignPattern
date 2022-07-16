package command;

/**
 * @author vdsklnl
 * @create 2022-07-06 19:55
 * @Description
 */

public interface Command {
    //执行操作
    public void execute();
    //撤销操作
    public void undo();
}
