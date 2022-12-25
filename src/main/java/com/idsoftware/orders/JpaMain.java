package com.idsoftware.orders;

import com.idsoftware.orders.model.Customer;
import com.idsoftware.orders.model.Order;
import com.idsoftware.orders.model.Product;
import com.idsoftware.orders.model.ProductOrder;
import com.idsoftware.sqlequivalents.Tupla;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JpaMain {
    private static List<Product> productList = Product.productList();
    private static List<Order> orderList = Order.orderList();
    private static List<Customer> customerList = Customer.customerList();
    private static List<ProductOrder> productOrderList = ProductOrder.productOrderList();

    public static void main(String[] args) {
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
}