package Decoration;

/**
 * Created by liqiushi on 2018/3/9.
 */
public class ConcreteDecorator2 extends Decorator{

    Component component;

    ConcreteDecorator2(Component component){
        this.component = component;
    }
    @Override
    public String getDescription() {
        return component.getDescription() + ",ConcreteDecorator2";
    }

    @Override
    public double getCost() {
        return component.getCost() + 2;
    }
}