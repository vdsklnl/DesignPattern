package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author vdsklnl
 * @create 2022-07-06 11:20
 * @Description
 */

public class ProxyFactory implements MethodInterceptor {

    //维护目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回代理对象
    public Object getProxyInstance() {
        //创建工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即代理对象
        return enhancer.create();
    }

    //重写intercept方法，调用目标对象方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式---开始");
        Object returnVal = method.invoke(target, objects);
        System.out.println("Cglib代理模式---提交");
        return returnVal;
    }
}
