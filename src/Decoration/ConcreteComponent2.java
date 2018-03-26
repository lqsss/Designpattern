package Decoration;

/**
 * Created by liqiushi on 2018/3/9.
 */
public class ConcreteComponent2 extends Component {
    public ConcreteComponent2(){
        description = "ConcreteComponent2";
    }
    @Override
    public double getCost() {
        return 0.2;
    }
}
