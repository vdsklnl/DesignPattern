package iterator;

import iterator.college.College;
import iterator.iterator.Department;

import java.util.Iterator;
import java.util.List;

/**
 * @author vdsklnl
 * @create 2022-07-07 20:25
 * @Description
 */

public class OutputImpl {

    List<College> list;

    public OutputImpl(List<College> list) {
        this.list = list;
    }

    public void printCollege() {
        Iterator<College> iterator = list.iterator();
        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println("========" + college.getName() + "========");
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }

}
