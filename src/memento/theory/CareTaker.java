package memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vdsklnl
 * @create 2022-07-09 11:32
 * @Description
 */

public class CareTaker {
    private List<Memento> list = new ArrayList<>();

    public void add(Memento memento) {
        list.add(memento);
    }

    public Memento get(int index) {
        return list.get(index);
    }
}
