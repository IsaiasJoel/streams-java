package com.idsoftware.jpaorders.repos;

import com.idsoftware.jpaorders.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends CrudRepository<Order, Long> {

    List<Order> findAll();
}
