package homework.lectures.lecture7_collections.shop;

import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    private static final Logger logger = Logger.getLogger(Shop.class);
    private final Map<String, BigDecimal> shopMap = new HashMap<>();
    private Product product;

    public Shop() {
    }

    public Shop(Product product) {
        this.product = product;
        shopMap.put(product.getProductName(), product.getProductCost());
    }

    public void addProduct(Product product) {
        shopMap.put(product.getProductName(), product.getProductCost());
        logger.info("The product " + product.getProductName() + " was added!");
    }

    public void deleteProduct(Product product) {
        shopMap.remove(product.getProductName());
        logger.info("The product " + product.getProductName() + " was deleted");
    }

    public void findProductByName(String productName) {
        boolean isFound = false;
        for (Map.Entry<String, BigDecimal> pair : shopMap.entrySet()) {
            if (pair.getKey().equals(productName)) {
                logger.info("The product " + productName + " is found! Name: " + pair.getKey() + ", Cost: " + pair.getValue().setScale(2, RoundingMode.DOWN).toString() + "$");
                isFound = true;
            }
        }

        if (!isFound) {
            logger.info("Sorry! The product " + productName + " was not found!");
        }
    }

    public void findProductByRange(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        boolean isFound = false;
        for (Map.Entry<String, BigDecimal> pair : shopMap.entrySet()) {
            if ((minPriceRange.compareTo(pair.getValue()) <= 0) && (pair.getValue().compareTo(maxPriceRange) <= 0)) {
                logger.info("At the range between " + minPriceRange + "$ and " + maxPriceRange + "$ we found the following product:");
                logger.info("Name: " + pair.getKey() + ", Cost: " + pair.getValue().setScale(2, RoundingMode.DOWN).toString() + "$;");
                isFound = true;
            }
        }
        if (!isFound) {
            logger.info("Sorry, but at the range between " + minPriceRange + " and " + maxPriceRange + " we didn't found any products!");
        }
    }


}
