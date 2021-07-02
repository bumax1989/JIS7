package homework.lectures.lecture7_collections.shop.service;

import homework.lectures.lecture7_collections.shop.entity.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static homework.lectures.lecture7_collections.shop.repository.ProductRepository.getProductList;

public class ProductService {

    public static Product addProduct(Product product) {
        getProductList().add(product);
        return product;
    }

    public static void deleteProduct(String productName) {
        getProductList().removeIf(it -> it.getProductName().equals(productName));
    }

    public static List<Product> findProductsByName(String productName) {
        return getProductList().stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getProductName().equals(productName))
                .collect(Collectors.toList());
    }

    public static List<Product> findProductByRange(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        return getProductList().stream()
                .filter(Objects::nonNull)
                .filter(it -> it.getProductCost().compareTo(minPriceRange) >= 0 && it.getProductCost().compareTo(maxPriceRange) <=0)
                .collect(Collectors.toList());
    }
}
