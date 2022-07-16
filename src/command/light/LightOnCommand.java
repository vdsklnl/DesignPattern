package command.light;

import command.Command;

/**
 * @author vdsklnl
 * @create 2022-07-06 19:58
 * @Description
 */

public class LightOnCommand implements Command {

    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
