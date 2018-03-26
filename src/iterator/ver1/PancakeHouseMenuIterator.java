package iterator.ver1;

import java.util.ArrayList;

/**
 * Created by liqiushi on 2017/12/7.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;

    int pos = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (pos >= menuItems.size() || menuItems.get(pos) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(pos);
        pos++;

        return menuItem;
    }
}
