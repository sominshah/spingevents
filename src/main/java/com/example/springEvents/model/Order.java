package com.example.springEvents.model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

public class Order implements Comparable<Order>, Serializable
{
    private String orderId;
    private BigDecimal orderAmount;
    private Instant orderDate;
    public Order()
    {

    }
    public Order(String orderId, BigDecimal orderAmount, Instant orderDate)
    {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
        this.orderDate = orderDate;

    }
    public String getOrderId()
    {
        return orderId;
    }
    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }
    public BigDecimal getOrderAmount()
    {
        return orderAmount;
    }
    public void setOrderAmount(BigDecimal orderAmount)
    {
        this.orderAmount = orderAmount;
    }
    public Instant getOrderDate()
    {
        return orderDate;
    }
    public void setOrderDate(Instant orderDate)
    {
        this.orderDate = orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Order order)) return false;
        return Objects.equals(getOrderId(), order.getOrderId());
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getOrderId());
    }

    @Override
    public int compareTo(Order o)
    {
        if(o == null) return 1;
        else return getOrderId().compareTo(o.getOrderId());
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderAmount=" + orderAmount +
                ", orderDate=" + orderDate +
                '}';
    }
}
