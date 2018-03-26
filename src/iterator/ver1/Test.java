package iterator.ver1;

/**
 * Created by liqiushi on 2017/12/7.
 */
public class Test {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinnerMenu);
        waitress.printMenu();
    }
}
