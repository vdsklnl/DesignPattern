package iterator.college;

import iterator.iterator.ComputerCollegeIterator;
import iterator.iterator.Department;

import java.util.Iterator;

/**
 * @author vdsklnl
 * @create 2022-07-07 17:03
 * @Description
 */

public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartments = 0;

    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("Java", "Java");
        addDepartment("PHP", "PHP");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[numOfDepartments++] = new Department(name, desc);
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
