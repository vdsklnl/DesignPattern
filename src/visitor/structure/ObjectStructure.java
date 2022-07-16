package visitor.structure;

import visitor.action.Action;
import visitor.label.People;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vdsklnl
 * @create 2022-07-06 21:31
 * @Description
 */

public class ObjectStructure {

    private List<People> persons = new ArrayList<>();

    //添加
    public void attach(People p) {
        persons.add(p);
    }

    //删除
    public void detach(People p) {
        persons.remove(p);
    }

    //显示评价
    public void display(Action action) {
        for (People p:persons) {
            p.accept(action);
        }
    }
}
