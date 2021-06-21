package homework.lectures.lecture7_collections.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.log4j.Logger;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Shop {
    private String shopName;
    private List<Product> listOfProducts;
}
