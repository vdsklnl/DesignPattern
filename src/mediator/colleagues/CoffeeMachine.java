package mediator.colleagues;

import mediator.mediator.Mediator;

/**
 * @author vdsklnl
 * @create 2022-07-09 10:29
 * @Description
 */

public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state, this.name);
    }

    public void Start() {
        System.out.println("Prepare coffee~");
    }

    public void Stop() {
        System.out.println("5 minutes later~");
        System.out.println("Coffee is already!");
        sendMessage(0);
    }
}
