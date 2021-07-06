package homework.lectures.lecture7_collections.shop.repository;

import homework.lectures.lecture7_collections.shop.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private static final List<Product> productList = new ArrayList<>();

    public static List<Product> getProductList() {
        return productList;
    }
}
