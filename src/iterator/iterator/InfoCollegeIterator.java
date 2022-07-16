package iterator.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author vdsklnl
 * @create 2022-07-07 16:29
 * @Description
 */

public class InfoCollegeIterator implements Iterator {

    //元素存放方式=>集合
    List<Department> list;
    int index = -1;

    public InfoCollegeIterator(List<Department> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.size() - 1)
            return false;
        else
            index++;
        return true;
    }

    @Override
    public Object next() {
        return list.get(index);
    }

    public void remove() {

    }
}
