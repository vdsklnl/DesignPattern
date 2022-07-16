package command;

import command.light.LightOffCommand;
import command.light.LightOnCommand;
import command.light.LightReceiver;

/**
 * @author vdsklnl
 * @create 2022-07-06 20:19
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        //灯管理操作
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //遥控器
        RemoteController controller = new RemoteController();
        controller.setCommands(0, lightOnCommand, lightOffCommand);
        //按开关
        System.out.println("=========按下电灯开按钮=========");
        controller.onButton(0);
        System.out.println("=========按下电灯关按钮=========");
        controller.offButton(0);
        System.out.println("=========按下电灯撤销按钮=========");
        controller.undoButton();
    }
}
