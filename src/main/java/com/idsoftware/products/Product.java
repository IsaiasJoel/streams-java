package com.idsoftware.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private Double price;

    public static List<Product> getProducts(){
        return Arrays.asList(
            new Product(1, "Ceviche", 15.0),
            new Product(2, "Chilaquiles", 25.50),
            new Product(3, "Bandeja Paisa", 35.50),
            new Product(4, "Ceviche", 15.0)
        );
    }

}
