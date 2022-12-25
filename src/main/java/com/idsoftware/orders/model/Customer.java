package com.idsoftware.orders.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private Integer id;
    private String name;
    private Integer tier;

    public static List<Customer> customerList(){
        return Arrays.asList(
            new Customer(1, "Stefan Walker", 1),
            new Customer (2, "Daija Von", 1),
            new Customer(3, "Ariane Rodriguez", 1),
            new Customer(4, "Marques Nikolaus", 2),
            new Customer(5, "Rachelle Greenfelder", 0),
            new Customer(6, "Larissa White", 2),
            new Customer (7, "Fae Heidenreich", 1),
            new Customer (8, "Dino Will", 2),
            new Customer (9, "Eloy Stroman", 1),
            new Customer (10, "'Brisa O''Connell'", 1)
        );
    }
}
