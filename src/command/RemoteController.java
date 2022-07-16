package command;

import command.light.NoCommand;

/**
 * @author vdsklnl
 * @create 2022-07-06 20:04
 * @Description
 */

public class RemoteController {
    //按钮命令数组
    Command[] onCommands;
    Command[] offCommands;

    //撤销命令，需知晓上一操作才能撤销
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        //提前置空
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //设置命令
    public void setCommands(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //开按钮管理
    public void onButton(int no) {
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    //关按钮管理
    public void offButton(int no) {
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    //撤销按钮管理
    public void undoButton() {
        undoCommand.undo();
    }
}
