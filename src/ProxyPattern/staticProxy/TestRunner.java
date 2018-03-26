package ProxyPattern.staticProxy;

/**
 * Created by liqiushi on 2018/1/3.
 */
public class TestRunner {
    public static void main(String[] args) {
        Subject subjectProxy = new SubjectProxy(new RealSubject());
        subjectProxy.doSomething();
    }
}
