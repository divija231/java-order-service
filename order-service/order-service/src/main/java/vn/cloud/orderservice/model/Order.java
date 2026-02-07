package vn.cloud.orderservice.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Order {

    private Long id;
    private Long customerId;
    private ZonedDateTime orderDate;
    private BigDecimal amount;

    public Order() {
    }

    public Order(Long id, Long customerId, ZonedDateTime orderDate, BigDecimal amount) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.amount = amount;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }

    public ZonedDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(ZonedDateTime orderDate) { this.orderDate = orderDate; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
}

