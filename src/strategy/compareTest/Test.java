package strategy.compareTest;

import strategy.compareTest.DataSort.DataSort;
import strategy.compareTest.pojo.Cat;

/**
 * Created by liqiushi on 2017/11/20.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 4};
        DataSort.sort(array);
        DataSort.print(array);
        System.out.println();
        System.out.println("-----------------------现在给一个对象排序-----------------------");
        Cat cat[] = {new Cat(5, 5), new Cat(3, 3), new Cat(1, 1)};
        DataSort.sort(cat);
        DataSort.print(cat);
    }
}
