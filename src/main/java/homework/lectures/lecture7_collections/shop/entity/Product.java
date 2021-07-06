package homework.lectures.lecture7_collections.shop.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private final String productName;
    private final BigDecimal productCost;

    public Product(String productName, BigDecimal productCost) {
        this.productName = productName;
        this.productCost = productCost;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getProductCost() {
        return productCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName) &&
                Objects.equals(productCost, product.productCost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productCost);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCost=" + productCost +
                '}';
    }
}
