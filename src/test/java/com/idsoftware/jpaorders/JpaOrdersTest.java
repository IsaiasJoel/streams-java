package com.idsoftware.jpaorders;

import com.idsoftware.jpaorders.repos.CustomerRepo;
import com.idsoftware.jpaorders.repos.OrderRepo;
import com.idsoftware.jpaorders.repos.ProductRepo;
import com.idsoftware.products.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@Slf4j
@DataJpaTest
class JpaOrdersTest {
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private ProductRepo productRepo;

    @Test
    @DisplayName("Obtain a list of product with category = \"Books\" and price > 100")
    void exercise1() {
        long startTime = System.currentTimeMillis();
        List<Product> result = productRepo.findAll()
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .filter(p -> p.getPrice() > 100)
                .toList();
        long endTime = System.currentTimeMillis();

        log.info(String.format("exercise 1 - execution time: %1$d ms", (endTime - startTime)));
        result.forEach(p -> log.info(p.toString()));
    }

    //Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
//        productList.stream()
//                .filter(x -> x.getCategory().equals("Books"))
//                .filter(x -> x.getPrice() > 100)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

    //Exercise 2 — Obtain a list of order with products belong to category “Baby”


    //Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
//        productList.stream()
//                .filter(x -> x.getCategory().equals("Toys"))
//                .map(x -> x.withPrice(x.getPrice() * 0.9))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

    //Exercise 4 — Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021


//        //Exercise 5 — Get the cheapest products of “Books” category
//        productList.stream()
//                .filter(x -> x.getCategory().equals("Books"))
//                .sorted(Comparator.comparing(Product::getPrice))
//                .forEach(System.out::println);

    //Exercise 6 — Get the 3 most recent placed order
//        orderList.stream()
//                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
//                .limit(3)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

    //Exercise 7 — Get a list of orders which were ordered on 15-Mar-2021,
    // log the order records to the console and then return its product list
//        var orders = orderList.stream()
//                .filter(x -> x.getOrderDate().isEqual(LocalDate.of(2021,3,15)))
//                .collect(Collectors.toList());
    ////////////////////////falta mostrar la lista de productos de cada orden


    //Exercise 8 — Calculate total lump sum of all orders placed in Feb 2021
//        orderList.stream()
//                .filter(x -> x.getOrderDate().isAfter(LocalDate.of(2021,2,1)))
//                .filter(x -> x.getOrderDate().isBefore(LocalDate.of(2021,2,28)))
//                //acá tiene que ser con el precio de cada producto de la orden
//                //.collect(Collectors.summarizingDouble())
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

    //Exercise 9 — Calculate order average payment placed on 14-Mar-2021

    //Exercise 10 — Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books”
//        var result = productList.stream()
//                .filter(x -> x.getCategory().equals("Books"))
//                .collect(Collectors.summarizingDouble(Product::getPrice));
//        System.out.println(result);


    //Exercise 11 — Obtain a data map with order id and order’s product count
//        var result = orderList.stream()
//                .collect(Collectors.toMap(
//                        Order::getId,
//                        order -> order.getStatus()
//                ));
//        System.out.println(result);


    //Exercise 12 — Produce a data map with order records grouped by customer

    //Exercise 13 — Produce a data map with order record and product total sum

    //Exercise 14 — Obtain a data map with list of product name by category
//        var result = productList.stream()
//                .collect(
//                        Collectors.groupingBy(
//                                Product::getCategory,
//                                Collectors.mapping(Product::getName, Collectors.toList())
//                        )
//                );

    //Exercise 15 — Get the most expensive product by category


//        orderList.stream()
//                .flatMap(
//                        order -> productList.stream()
//                                    .map(product -> Order.addProductToList(order,product)))
////                .filter(t -> Objects.equals(t.getId(), t.getId()))
//                .distinct()
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
}
