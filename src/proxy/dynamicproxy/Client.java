package proxy.dynamicproxy;

/**
 * @author vdsklnl
 * @create 2022-07-06 10:59
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        //class jdk.proxy1.$Proxy0，表示代理对象
        System.out.println(proxyInstance.getClass());
//        proxyInstance.teach();
        proxyInstance.hello("Mike");
    }
}
