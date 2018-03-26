package Decoration;

/**
 * Created by liqiushi on 2018/3/9.
 */
public class Test {
    public static void main(String[] args) {
        Component component = new ConcreteComponent1();
        Component d1 = new ConcreteDecorator1(component);
        Component d2 = new ConcreteDecorator2(d1);
        System.out.println(d1.getDescription());
        System.out.println(d2.getDescription());
        System.out.println(d1.getCost());
        System.out.println(d2.getCost());
    }
}
