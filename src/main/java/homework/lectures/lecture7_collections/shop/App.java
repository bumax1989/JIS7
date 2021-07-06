package homework.lectures.lecture7_collections.shop;

import homework.lectures.lecture7_collections.shop.entity.Product;
import homework.lectures.lecture7_collections.shop.entity.Shop;
import homework.lectures.lecture7_collections.shop.repository.ProductRepository;
import homework.lectures.lecture7_collections.shop.service.ProductService;
import org.apache.log4j.BasicConfigurator;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        BasicConfigurator.configure();

        ProductService.addProduct(new Product("Milk", new BigDecimal("1.5")));
        ProductService.addProduct(new Product("Bread", new BigDecimal("0.8")));
        ProductService.addProduct(new Product("Bread", new BigDecimal("0.5")));
        ProductService.addProduct(new Product("Bread", new BigDecimal("1.1")));
        ProductService.addProduct(new Product("Eggs", new BigDecimal("3.39")));

        Shop shop = new Shop("Evroopt",ProductRepository.getProductList());
        System.out.println(shop.getListOfProducts());

        ProductService.deleteProduct("Milk");
        System.out.println(shop.getListOfProducts());

        System.out.println(ProductService.findProductsByName("Bread"));

        System.out.println(ProductService.findProductByRange(new BigDecimal("0.8"), new BigDecimal("3.5")));
    }
}
