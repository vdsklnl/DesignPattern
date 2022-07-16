package memento.game;

/**
 * @author vdsklnl
 * @create 2022-07-09 14:00
 * @Description
 */

public class Memento {
    private int attack;
    private int defend;

    public Memento(int attack, int defend) {
        this.attack = attack;
        this.defend = defend;
    }

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
}
