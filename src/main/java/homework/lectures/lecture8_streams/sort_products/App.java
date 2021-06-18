package homework.lectures.lecture8_streams.sort_products;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class App {
    public static final Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>() {{
            add(new Product("Milk", 3.45, 15.3));
            add(new Product("Bread", 0.5, 50.3));
            add(new Product("White Bread", 0.5, 50.3));
            add(new Product("Cheese", 25.7, 40.2));
            add(new Product("Eggs", 3.39, 0.0));
            add(new Product("Pepsi 1.5l", 1.89, 0.0));
            add(new Product("Meat", 15.99, 0.0));
            add(new Product("Potatoes", 0.5, 0.0));
            add(null);
        }};

        List<Product> sortedProductsByDiscountAndPrice = productList.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Product::getDiscount)
                        .thenComparing(Product::getPrice))
                .collect(Collectors.toList());

        log.info(sortedProductsByDiscountAndPrice);
    }
}
