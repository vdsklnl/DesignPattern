package mediator.colleagues;

import mediator.mediator.Mediator;

/**
 * @author vdsklnl
 * @create 2022-07-09 10:23
 * @Description
 */

public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state, this.name);
    }

    public void Start() {
        System.out.println("Start TV~");
    }

    public void Stop() {
        System.out.println("Stop TV~");
    }
}
