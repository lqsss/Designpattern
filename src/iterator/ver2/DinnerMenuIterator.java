package iterator.ver2;

/**
 * Created by liqiushi on 2017/12/6.
 */
public class DinnerMenuIterator implements Iterator, java.util.Iterator {
    MenuItem[] items;
    // position记录当前数组遍历的位置
    int position = 0;

    // 构造器需要被传入一个菜单项的数组当做参数
    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    // next()方法返回数组内的下一项，并递增其位置
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        
    }

    // hasNext()方法会检查我们是否已经取得数组内所有的元素。
    // 如果还有元素待遍历，则返回true
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}