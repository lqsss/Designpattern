package ProxyPattern.dynamicProxy.JDK;

public class TestRunner {
    public static void main(String[] args) {
        LogProxy logProxy = new LogProxy();
        Subject subjectProxy = (Subject) logProxy.newProxyInstance(new RealSubject());
        subjectProxy.otherFun();
    }
}