package ProxyPattern.dynamicProxy.CGLib;


/**
 * Created by liqiushi on 2018/1/3.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("do something! ");
    }

    @Override
    public void otherFun() {
        System.out.println("other something! ");
    }
}
