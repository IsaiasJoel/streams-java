package com.idsoftware.jpaorders;

import com.idsoftware.jpaorders.repos.CustomerRepo;
import com.idsoftware.jpaorders.repos.OrderRepo;
import com.idsoftware.jpaorders.repos.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class JpaOrdersCommandRunner implements CommandLineRunner {
    @Autowired
    private CustomerRepo customerRepos;

    @Autowired
    private OrderRepo orderRepos;

    @Autowired
    private ProductRepo productRepos;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        log.info("Customers:");
        customerRepos.findAll()
                .forEach(c -> log.info(c.toString()));

        log.info("Orders:");
        orderRepos.findAll()
                .forEach(o -> log.info(o.toString()));

        log.info("Products:");
        productRepos.findAll()
                .forEach(p -> log.info(p.toString()));
    }
}
