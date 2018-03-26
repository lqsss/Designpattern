package iterator.ver2;
import java.util.Iterator;
/**
 * Created by liqiushi on 2017/12/5.
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinnerMenu;

    // 在构造器中，女招待照顾两个菜单
    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        // 这个printMenu()方法为每一个菜单各自创建一个迭代器
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        // 然后调用重载的printMenu()，将迭代器传入
        printMenu(pancakeIterator);
        printMenu(dinnerIterator);
    }

    // 这个重载的printMenu()方法，使用迭代器来遍历菜单项并打印出来
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " " +
                    menuItem.getPrice() + " " + menuItem.getDescription());
        }
    }
}
