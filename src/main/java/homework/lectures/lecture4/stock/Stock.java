package homework.lectures.lecture4.stock;

import org.apache.log4j.Logger;

public class Stock {

    private static final Logger logger = Logger.getLogger(Stock.class);

    private String companyName;
    private Integer currentPrice;

    public Stock(String companyName, Integer currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
    }

    private Integer minPrice;
    private Integer maxPrice;

    public void printInformation() {

        minPrice=currentPrice;
        maxPrice =currentPrice;

        logger.info("Company = "+companyName+", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice);

    }

    public void updatePrice(Integer currentInputPrice) {

        currentPrice = currentInputPrice;

        if (currentPrice < minPrice) {
            minPrice = currentPrice;
        }

        if (currentPrice > maxPrice) {
            maxPrice = currentPrice;
        }
        logger.info("Company = "+companyName+", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice);
    }
}
