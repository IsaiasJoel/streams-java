package com.idsoftware.products;

import com.idsoftware.people.People;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductsMain {
    public static void main(String[] args) {
        List<Product> productList = Product.getProducts();

        // 6-Collectors

        // GroupBy
        Map<String, List<Product>> collect1 = productList.stream()
                .filter(p -> p.getPrice() > 20)
                .collect(Collectors.groupingBy(Product::getName));

        // Counting
        Map<String, Long> collect2 = productList.stream()
                .collect(Collectors.groupingBy(
                                Product::getName, Collectors.counting()
                        )
                );


        //Agrupando por nombre producto y sumando
        Map<String, Double> collect3 = productList.stream()
                .collect(Collectors.groupingBy(
                                Product::getName,
                                Collectors.summingDouble(Product::getPrice)
                        )
                );


        //Obteniendo suma y resumen
        DoubleSummaryStatistics statistics = productList.stream()
                .collect(Collectors.summarizingDouble(Product::getPrice));


        //7-reduce
        Optional<Double> sum = productList.stream()
                .map(Product::getPrice)
                .reduce(Double::sum);
        //.reduce((a,b) -> a+b)
    }

    public static void printList(List<?> list){
        list.forEach(System.out::println);
    }

}
