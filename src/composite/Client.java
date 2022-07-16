package composite;

/**
 * @author vdsklnl
 * @create 2022-06-29 13:42
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        OrganizationComposite university = new University("清华大学", "一流大学");
        OrganizationComposite computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComposite engineerCollege = new College("工程学院", "工程学院");

        university.add(computerCollege);
        university.add(engineerCollege);

        computerCollege.add(new Department("软件工程", "软件工程专业"));
        computerCollege.add(new Department("信息工程", "信息工程专业"));
        engineerCollege.add(new Department("电气工程", "电气工程专业"));
        engineerCollege.add(new Department("机械工程", "机械工程专业"));
        engineerCollege.add(new Department("土木工程", "土木工程专业"));

        engineerCollege.print();
    }
}
