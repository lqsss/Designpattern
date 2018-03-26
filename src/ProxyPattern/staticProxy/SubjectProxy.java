package ProxyPattern.staticProxy;

/**
 * Created by liqiushi on 2018/1/3.
 */
public class SubjectProxy implements Subject {
    private Subject subjectImpl = null;

    public SubjectProxy(Subject subject) {
        this.subjectImpl = subject;
    }

    @Override
    public void doSomething() {
        System.out.println("before real subject");
        subjectImpl.doSomething();
        System.out.println("after real subject");
    }
}
