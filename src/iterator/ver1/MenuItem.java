package iterator.ver1;

/**
 * Created by liqiushi on 2017/12/5.
 */
public class MenuItem {
    String name;
    //描述
    String description;
    // 是否为素食
    boolean vegetarian;
        // 价格

    double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public double getPrice() {
        return price;
    }
    
    public boolean isVegetarian() {
        return vegetarian;
    }
}