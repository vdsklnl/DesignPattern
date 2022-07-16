package iterator.college;

import iterator.iterator.Department;
import iterator.iterator.InfoCollegeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author vdsklnl
 * @create 2022-07-07 20:19
 * @Description
 */

public class InfoCollege implements College {

    List<Department> list;

    public InfoCollege() {
        this.list = new ArrayList<>();
        addDepartment("网络安全", "网络安全");
        addDepartment("信息安全", "信息安全");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        list.add(new Department(name, desc));
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(list);
    }
}
