package homework.lectures.lecture7_collections.shop;

import java.math.BigDecimal;

public class Product {
    private String productName;
    private BigDecimal productCost;

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
}
