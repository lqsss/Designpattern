package strategy.compareTest.DataSort;

import strategy.compareTest.interface_.Comparable;
import strategy.compareTest.pojo.Cat;

import java.util.Objects;

/**
 * Created by liqiushi on 2017/11/20.
 */
public class DataSort {
    public static void sort(int[] a) {
        for (int i = a.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a,j,j+1);
                }
            }
        }
    }

    private static void swap(int a[],int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
    }

/*    public static void sort(Object[] a) {
        Cat[] c = (Cat[])a;
        for (int i = a.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (c[j].getHeight() > c[j+1].getHeight()) {
                    swap(c,j,j+1);
                }
            }
        }
    }*/

    private static void swap(Object a[],int x, int y) {
        Object temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void print(Object[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
    }

    public static void sort(Object[] a) {
        for (int i = a.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                Comparable o1 = (Comparable) a[j];
                Comparable o2 = (Comparable) a[j+1];
                if (o1.compareTo(o2) == 1) {
                    swap(a,j,j+1);
                }
            }
        }
    }
}
