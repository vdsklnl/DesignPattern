package iterator;

import iterator.college.College;
import iterator.college.ComputerCollege;
import iterator.college.InfoCollege;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vdsklnl
 * @create 2022-07-07 20:43
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        List<College> colleges = new ArrayList<>();
        colleges.add(new ComputerCollege());
        colleges.add(new InfoCollege());
        OutputImpl output = new OutputImpl(colleges);
        output.printCollege();
    }
}
