package mediator;

import mediator.colleagues.Alarm;
import mediator.colleagues.CoffeeMachine;
import mediator.colleagues.Curtain;
import mediator.colleagues.TV;
import mediator.mediator.ConcreteMediator;
import mediator.mediator.Mediator;

/**
 * @author vdsklnl
 * @create 2022-07-09 10:57
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator, "Alarm");
        TV tv = new TV(mediator, "TV");
        Curtain curtain = new Curtain(mediator, "Curtain");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "CoffeeMachine");
        alarm.sendAlarm(0);
        coffeeMachine.Stop();
        alarm.sendAlarm(1);
    }
}
