package homework.lectures.lecture7_collections.shop;

import org.apache.log4j.BasicConfigurator;

import java.math.BigDecimal;

public class ShopDemo {
    public static void main(String[] args) {
        BasicConfigurator.configure();

        Product milk = new Product("Milk", new BigDecimal(1.5));
        Product bread = new Product("Bread", new BigDecimal(0.8));
        Product eggs = new Product("Eggs", new BigDecimal(3.39));

        Shop shop = new Shop();

        Shop shop1 = new Shop(new Product("Cheese", new BigDecimal(4.99)));

        shop.addProduct(milk);
        shop.addProduct(bread);
        shop.addProduct(eggs);

        shop.findProductByName("Milk");
        shop.findProductByName("Eggs");

        shop.findProductByRange(new BigDecimal(1), new BigDecimal(5));

        shop.deleteProduct(eggs);
        shop.findProductByName("Eggs");

        shop.findProductByRange(new BigDecimal(10), new BigDecimal(50));
    }
}
