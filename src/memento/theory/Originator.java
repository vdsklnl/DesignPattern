package memento.theory;

/**
 * @author vdsklnl
 * @create 2022-07-09 11:23
 * @Description
 */

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveMementoState() {
        return new Memento(state);
    }

    public void load(Memento memento) {
        this.state = memento.getState();
    }
}
