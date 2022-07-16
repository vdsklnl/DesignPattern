package memento.theory;

/**
 * @author vdsklnl
 * @create 2022-07-09 11:24
 * @Description
 */

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
