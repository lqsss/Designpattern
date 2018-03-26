package Decoration;

/**
 * Created by liqiushi on 2018/3/9.
 */
public class ConcreteDecorator1 extends Decorator{
    
    private Component component;

    ConcreteDecorator1(Component component){
        this.component = component;
    }
    @Override
    public String getDescription() {
        return component.getDescription() + ",ConcreteDecorator1";
    }

    @Override
    public double getCost() {
        return component.getCost() + 1;
    }
}
