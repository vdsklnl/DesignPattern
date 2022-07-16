package iterator.college;

import java.util.Iterator;

/**
 * @author vdsklnl
 * @create 2022-07-07 16:58
 * @Description
 */

public interface College {
    public String getName();
    public void addDepartment(String name, String desc);
    public Iterator createIterator();
}
