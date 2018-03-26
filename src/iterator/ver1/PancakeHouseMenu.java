package iterator.ver1;


import java.util.ArrayList;

/**
 * Created by liqiushi on 2017/12/5.
 */
public
class  PancakeHouseMenu {

    // 煎饼屋使用一个ArrayList存储他的菜单项

    ArrayList menuItems;

    public PancakeHouseMenu() {

        menuItems = new ArrayList();

        // 在菜单的构造器中，每一个菜单项都会被加入到ArrayList中

        // 每个菜单项都有一个名称、一个描述、是否为素食、还有价格

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    
    // 要加入一个菜单项，煎饼屋的做法是创建一个新的菜单项对象，
    // 传入每一个变量，然后将它加入ArrayList中
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    

    // 这个方法返回菜单项列表
    public ArrayList getMenuItems() {

        return menuItems;

    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    // 这里还有菜单的其他方法，这些方法都依赖于这个ArrayList，所以煎饼屋不希望重写全部的代码！

    // ...

}

