package command.light;

import command.Command;

/**
 * @author vdsklnl
 * @create 2022-07-06 19:58
 * @Description
 */

public class LightOffCommand implements Command {

    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
