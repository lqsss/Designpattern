package ProxyPattern.dynamicProxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by liqiushi on 2018/1/4.
 */
public class LogProxy implements InvocationHandler {
    private Object targetObject;

    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        //第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke() call!");
        System.out.println();
        Object res = null;
        System.out.println("before realSubject!");
        res = method.invoke(targetObject, args);
        System.out.println("after realSubject!");
        return null;
    }
}
