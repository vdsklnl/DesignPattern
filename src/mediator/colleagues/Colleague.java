package mediator.colleagues;

import mediator.mediator.Mediator;

/**
 * @author vdsklnl
 * @create 2022-07-08 22:08
 * @Description
 */

public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void sendMessage(int state);
}
