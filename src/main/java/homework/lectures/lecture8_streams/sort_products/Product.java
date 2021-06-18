package homework.lectures.lecture8_streams.sort_products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private String name;
    private Double price;
    private Double discount;
}
