package ProxyPattern.dynamicProxy.CGLib;


import net.sf.cglib.proxy.Enhancer;

public class TestRunner {
    public static <T> T getProxy(Class clazz) {
        Enhancer en = new Enhancer();
        en.setSuperclass(clazz);
        en.setCallback(new LogProxy());
        return (T) en.create();
    }

    public static void main(String[] args) {
        //Enhancer 这里Enhancer类是CGLib中的一个字节码增强器，它可以方便的对你想要处理的类进行扩展
        Enhancer enhancer = new Enhancer();
        //将委托类设置父类
        enhancer.setSuperclass(RealSubject.class);
        //设置回调拦截
        enhancer.setCallback(new LogProxy());
        //生成代理对象，需要转型
       Subject subject  = (RealSubject) enhancer.create();
       // Subject subject = TestRunner.getProxy(RealSubject.class);

        subject.otherFun();
    }
}