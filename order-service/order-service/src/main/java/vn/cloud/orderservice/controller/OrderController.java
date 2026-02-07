package vn.cloud.orderservice.controller;

import vn.cloud.orderservice.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id) {
        // Returning a sample order
        return new Order(id, 1L, ZonedDateTime.now(), BigDecimal.TEN);
    }
}

