package com.idsoftware.orders.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Integer id;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;
    private Integer customerId;
    private static List<Product> products;
    private Customer customer;

    public static Order addProductToList(Order order,Product product){
        products = new ArrayList<>();
        order.products.add(product);
        return order;
    }

    public Order(Integer id, LocalDate orderDate, LocalDate deliveryDate,String status,Integer customerId){
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.customerId = customerId;
    }

    public static List<Order> orderList(){
        return Arrays.asList(
            new Order (1, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-08"), "NEW", 5),
            new Order (2, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-05"), "NEW", 3),
            new Order (3, LocalDate.parse("2021-04-10"), LocalDate.parse("2021-04-18"), "DELIVERED", 5),
            new Order (4, LocalDate.parse("2021-03-22"), LocalDate.parse("2021-03-27"), "PENDING", 3),
            new Order (5, LocalDate.parse("2021-03-04"), LocalDate.parse("2021-03-12"), "NEW", 1),
            new Order (6, LocalDate.parse("2021-03-30"), LocalDate.parse("2021-04-07"), "DELIVERED", 9),
            new Order (7, LocalDate.parse("2021-03-05"), LocalDate.parse("2021-03-09"), "PENDING", 8),
            new Order (8, LocalDate.parse("2021-03-27"), LocalDate.parse("2021-04-05"), "NEW", 4),
            new Order (9, LocalDate.parse("2021-04-14"), LocalDate.parse("2021-04-18"), "NEW", 10),
            new Order (10, LocalDate.parse("2021-03-10"), LocalDate.parse("2021-03-19"), "NEW", 8),
            new Order (11, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-04"), "DELIVERED", 1),
            new Order (12, LocalDate.parse("2021-02-24"), LocalDate.parse("2021-02-28"), "PENDING", 5),
            new Order (13, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-21"), "NEW", 5),
            new Order (14, LocalDate.parse("2021-03-30"), LocalDate.parse("2021-04-07"), "PENDING", 4),
            new Order (15, LocalDate.parse("2021-03-13"), LocalDate.parse("2021-03-14"), "DELIVERED", 5),
            new Order (16, LocalDate.parse("2021-03-13"), LocalDate.parse("2021-03-21"), "NEW", 1),
            new Order (17, LocalDate.parse("2021-03-31"), LocalDate.parse("2021-03-31"), "DELIVERED", 6),
            new Order (18, LocalDate.parse("2021-03-25"), LocalDate.parse("2021-03-31"), "PENDING", 9),
            new Order (19, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-09"), "DELIVERED", 9),
            new Order (20, LocalDate.parse("2021-03-23"), LocalDate.parse("2021-03-30"), "NEW", 5),
            new Order (21, LocalDate.parse("2021-03-19"), LocalDate.parse("2021-03-24"), "DELIVERED", 9),
            new Order (22, LocalDate.parse("2021-02-27"), LocalDate.parse("2021-03-01"), "NEW", 5),
            new Order (23, LocalDate.parse("2021-04-19"), LocalDate.parse("2021-04-24"), "PENDING", 4),
            new Order (24, LocalDate.parse("2021-03-24"), LocalDate.parse("2021-03-24"), "DELIVERED", 1),
            new Order (25, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-10"), "NEW", 1),
            new Order (26, LocalDate.parse("2021-03-17"), LocalDate.parse("2021-03-26"), "NEW", 10),
            new Order (27, LocalDate.parse("2021-03-20"), LocalDate.parse("2021-03-25"), "NEW", 1),
            new Order (28, LocalDate.parse("2021-04-09"), LocalDate.parse("2021-04-16"), "DELIVERED", 2),
            new Order (29, LocalDate.parse("2021-04-06"), LocalDate.parse("2021-04-08"), "PENDING", 1),
            new Order (30, LocalDate.parse("2021-04-19"), LocalDate.parse("2021-04-20"), "DELIVERED", 1),
            new Order (31, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-04"), "NEW", 3),
            new Order (32, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-24"), "DELIVERED", 2),
            new Order (33, LocalDate.parse("2021-04-18"), LocalDate.parse("2021-04-24"), "PENDING", 1),
            new Order (34, LocalDate.parse("2021-03-28"), LocalDate.parse("2021-03-28"), "NEW", 6),
            new Order (35, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-17"), "NEW", 1),
            new Order (36, LocalDate.parse("2021-03-04"), LocalDate.parse("2021-03-08"), "DELIVERED", 2),
            new Order (37, LocalDate.parse("2021-03-18"), LocalDate.parse("2021-03-25"), "NEW", 8),
            new Order (38, LocalDate.parse("2021-04-11"), LocalDate.parse("2021-04-20"), "NEW", 8),
            new Order (39, LocalDate.parse("2021-04-12"), LocalDate.parse("2021-04-17"), "NEW", 9),
            new Order (40, LocalDate.parse("2021-03-12"), LocalDate.parse("2021-03-12"), "PENDING", 3),
            new Order (41, LocalDate.parse("2021-02-24"), LocalDate.parse("2021-02-26"), "NEW", 5),
            new Order (42, LocalDate.parse("2021-04-08"), LocalDate.parse("2021-04-14"), "DELIVERED", 9),
            new Order (43, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-11"), "NEW", 3),
            new Order (44, LocalDate.parse("2021-03-12"), LocalDate.parse("2021-03-14"), "DELIVERED", 4),
            new Order (45, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-06"), "DELIVERED", 1),
            new Order (46, LocalDate.parse("2021-03-16"), LocalDate.parse("2021-03-22"), "NEW", 10),
            new Order (47, LocalDate.parse("2021-04-07"), LocalDate.parse("2021-04-12"), "PENDING", 2),
            new Order (48, LocalDate.parse("2021-04-05"), LocalDate.parse("2021-04-06"), "NEW", 2),
            new Order (49, LocalDate.parse("2021-04-10"), LocalDate.parse("2021-04-13"), "NEW", 7),
            new Order (50, LocalDate.parse("2021-03-18"), LocalDate.parse("2021-03-21"), "NEW", 9)
        );
    }
}
