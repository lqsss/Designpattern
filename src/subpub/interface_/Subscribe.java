package subpub.interface_;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liqiushi on 2017/11/22.
 */
public interface Subscribe {
    List<Observer> observers = new ArrayList<>();
    public void append(Observer observer);
    public void remove(Observer observer);
    public void myNotify();
}
