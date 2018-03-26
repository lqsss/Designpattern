package Decoration;

/**
 * Created by liqiushi on 2018/3/9.
 */
public class ConcreteComponent1 extends Component{
    public ConcreteComponent1(){
        description = "ConcreteComponent1";
    }
    @Override
    public double getCost() {
        return 0.1;
    }
}
