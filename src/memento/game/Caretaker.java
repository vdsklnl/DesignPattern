package memento.game;

import java.util.List;
import java.util.Map;

/**
 * @author vdsklnl
 * @create 2022-07-09 14:12
 * @Description 守护者对象，保存游戏角色状态
 */

public class Caretaker {

    //保存一次状态
    private Memento memento;
//    //保存多次状态
//    private List<Memento> list;
//    //保存多角色多次状态
//    private Map<String, List<Memento>> roles;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
