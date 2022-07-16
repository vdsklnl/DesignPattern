package proxy.staticproxy;

/**
 * @author vdsklnl
 * @create 2022-07-04 21:51
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        //创建被代理对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象
        TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
        proxy.teach();
    }
}
