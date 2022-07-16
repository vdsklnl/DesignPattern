package memento.game;

/**
 * @author vdsklnl
 * @create 2022-07-09 14:36
 * @Description
 */

public class Role {
    private int attack;
    private int defend;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public Memento createMemento() {
        return new Memento(attack, defend);
    }

    public void load(Memento memento) {
        this.attack = memento.getAttack();
        this.defend = memento.getDefend();
    }

    public void display() {
        System.out.println("攻击力：" + attack + "   防御力" + defend);
    }
}
