package strategy.compareTest.pojo;

import strategy.compareTest.interface_.Comparable;
import strategy.compareTest.interface_.Comparator;
import strategy.compareTest.interface_.impl.CatHeightComparator;

/**
 * Created by liqiushi on 2017/11/20.
 */
public class Cat implements Comparable {
    private int height;
    private int weight;
    private Comparator comparator = new CatHeightComparator();

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return this.height + "";
    }

    @Override
    public int compareTo(Object o) {
        return comparator.compare(this, o);
    }

/*    @Override
    public int compareTo(Object o) {
        if (o instanceof Cat) {
            Cat c = (Cat) o;
            if (this.getHeight() > c.getHeight()) {
                return 1;
            } else if (this.getHeight() < c.getHeight()) {
                return -1;
            } else return 0;
        }
        return -100;
    }*/
}
