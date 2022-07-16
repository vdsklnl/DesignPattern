package mediator.mediator;

import mediator.colleagues.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vdsklnl
 * @create 2022-07-08 22:13
 * @Description
 */

public class ConcreteMediator implements Mediator {

    private Map<String, Colleague> colleagueMap;
    private Map<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void register(String name, Colleague colleague) {
        colleagueMap.put(name, colleague);
        if (colleague instanceof Alarm)
            interMap.put("Alarm", name);
        else if (colleague instanceof TV)
            interMap.put("TV", name);
        else if (colleague instanceof Curtain)
            interMap.put("Curtain", name);
        else if (colleague instanceof CoffeeMachine)
            interMap.put("CoffeeMachine", name);
    }

    @Override
    public void getMessage(int state, String name) {
        if (colleagueMap.get(name) instanceof Alarm) {
            if (state == 0) {
                ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).Start();
                ((TV) colleagueMap.get(interMap.get("TV"))).Start();
            } else if (state == 1) {
                ((TV) colleagueMap.get(interMap.get("TV"))).Stop();
            }
        } else if (colleagueMap.get(name) instanceof CoffeeMachine) {
            ((Curtain) colleagueMap.get(interMap.get("Curtain"))).upCurtain();
        }
        else if (colleagueMap.get(name) instanceof TV) {

        } else if (colleagueMap.get(name) instanceof Curtain) {

        }
    }

    @Override
    public void sendMessage() {

    }
}
