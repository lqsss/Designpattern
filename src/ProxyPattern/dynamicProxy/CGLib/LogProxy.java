package ProxyPattern.dynamicProxy.CGLib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by liqiushi on 2018/1/4.
 */
public class LogProxy implements MethodInterceptor {

    /**定义一个拦截器。在调用目标方法时，CGLib会回调MethodInterceptor接口方法拦截，来实现你自己的代理逻辑，类似于JDK中的InvocationHandler接口。
     * 代理对象调用方法时，被此拦截
     * @param o 动态生成的代理对象
     * @param method 委托对象的方法
     * @param objects 委托对象的参数
     * @param methodProxy  CGlib方法代理对象的方法引用 
     * @return 调用方法返回值
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        System.out.println("before realSubject");
        //调用代理类实例上的proxy方法的父类方法(即委托类的方法)
        result = methodProxy.invokeSuper(o,objects);
        System.out.println("after realSubject");
        return result;
    }
}
