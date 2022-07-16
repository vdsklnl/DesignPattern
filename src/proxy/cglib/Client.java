package proxy.cglib;

/**
 * @author vdsklnl
 * @create 2022-07-06 12:48
 * @Description 由于JDK8后对反射功能进行限制，程序运行失败，未找到解决方法
 */

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        proxyInstance.teach();
    }
}
