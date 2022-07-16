package memento.theory;

/**
 * @author vdsklnl
 * @create 2022-07-09 13:42
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("状态#01 100");
        careTaker.add(originator.saveMementoState());
        originator.setState("状态#02 80");
        careTaker.add(originator.saveMementoState());
        originator.setState("状态#03 50");
        careTaker.add(originator.saveMementoState());
        System.out.println("当前状态：" + originator.getState());
        originator.load(careTaker.get(0));
        System.out.println("恢复状态：" + originator.getState());
    }
}
