package memento.game;

/**
 * @author vdsklnl
 * @create 2022-07-09 14:43
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        Role role = new Role();
        role.setAttack(100);
        role.setDefend(100);
        System.out.println("和boss大战前");
        role.display();

        //保存状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(role.createMemento());

        System.out.println("与boss交 ♂ 战");
        role.setDefend(30);
        role.setAttack(30);
        role.display();

        //备忘录模式恢复
        System.out.println("========回档========");
        role.load(caretaker.getMemento());
        role.display();
    }
}
