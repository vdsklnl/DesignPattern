package mediator.colleagues;

import mediator.mediator.Mediator;

/**
 * @author vdsklnl
 * @create 2022-07-09 10:21
 * @Description
 */

public class Curtain extends Colleague {
    public Curtain(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void upCurtain() {
        System.out.println("Holding up curtains!");;
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state, this.name);
    }
}
