package mediator.mediator;

import mediator.colleagues.Colleague;

/**
 * @author vdsklnl
 * @create 2022-07-08 22:08
 * @Description
 */

public interface Mediator {
    public void register(String name, Colleague colleague);

    public void getMessage(int state, String name);

    public void sendMessage();
}
