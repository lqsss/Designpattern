package Decoration;

/**
 * Created by liqiushi on 2018/3/9.
 */
public abstract class Component {
    protected String description = null;
    
    public String getDescription(){
        return description;
    }

    public abstract double getCost();
}
