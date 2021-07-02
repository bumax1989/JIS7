package homework.lectures.lecture8_streams.product_collection_stream;

import homework.lectures.lecture8_streams.product_collection_stream.model.Product;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class App {
    public static final Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        List<Product> productList = new ArrayList<>() {{
            add(new Product("Milk", 3.45, 15.3));
            add(new Product("Bread", 0.5, 50.3));
            add(new Product("White Bread", 0.5, 50.3));
            add(new Product("Cheese", 25.7, 40.2));
            add(new Product("Eggs", 3.39, 0.0));
            add(new Product("Pepsi 1.5l", 1.89, 6.1));
            add(new Product("Meat", 15.99, 7.9));
            add(new Product("Potatoes", 0.5, 0.0));
            add(null);
        }};

        productList.stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getDiscount() > 30.0 && product.getPrice() <= 10.5).forEach(System.out::println);

        Product maxPriceZeroDiscount = productList.stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getDiscount() == 0.0)
                .max(Comparator.comparing(Product::getPrice))
                .get();
        log.info(maxPriceZeroDiscount);

        Double minPriceValue = productList.stream()
                .filter(Objects::nonNull)
                .map(Product::getPrice)
                .min(Comparator.naturalOrder())
                .get();

        Double maxDiscountValue = productList.stream()
                .filter(Objects::nonNull)
                .map(Product::getDiscount)
                .max(Comparator.naturalOrder())
                .get();

        List<Product> minPriceValueAndMaxDiscountValue = productList.stream()
                .filter(Objects::nonNull)
                .filter(it -> it.getPrice().equals(minPriceValue) && it.getDiscount().equals(maxDiscountValue))
                .collect(Collectors.toList());
        log.info(minPriceValueAndMaxDiscountValue);

    }
}
