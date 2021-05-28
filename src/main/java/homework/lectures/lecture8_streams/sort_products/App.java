package homework.lectures.lecture8_streams.sort_products;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
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

        List<Product> sortedPriceZeroDiscount = productList.stream()
                .filter(Objects::nonNull)
                .filter(it -> it.getDiscount() == 0)
                .sorted((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()))
                .collect(Collectors.toList());

        List<Product> sortedPriceWithDiscount = productList.stream()
                .filter(Objects::nonNull)
                .filter(it -> it.getDiscount() > 0)
                .sorted((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()))
                .collect(Collectors.toList());

        List<Product> sortedListByPrice = Stream.concat(sortedPriceZeroDiscount.stream(), sortedPriceWithDiscount.stream())
                .collect(Collectors.toList());
        System.out.println(sortedListByPrice);

    }
}
