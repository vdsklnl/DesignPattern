package iterator.iterator;

import java.util.Iterator;

/**
 * @author vdsklnl
 * @create 2022-07-07 16:00
 * @Description
 */

public class ComputerCollegeIterator implements Iterator {

    //元素存储方式=>数组
    Department[] departments;
    int position = 0; //起始位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length||departments[position] == null)
            return false;
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position++];
        return department;
    }

    //删除，默认空实现
    public void remove() {

    }
}
