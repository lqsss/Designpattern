package iterator.ver2;

import java.util.Stack;

/**
 *  Menu接口，让客户程序不用知道具体的类型
 *  使用jdk自带的Iterator
 *  添加一个hashtable的菜单
 * Created by liqiushi on 2017/12/7.
 */
public class Test {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinnerMenu);
        waitress.printMenu();
        
    }
}
