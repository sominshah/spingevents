package com.example.springEvents.event;
import com.example.springEvents.model.Order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;
public class OrderEvent implements Serializable
{
        private String orderId;
        private BigDecimal orderAmount;
        private Instant orderDate;
        public OrderEvent()
        {
            orderDate = Instant.now();
        }
        public OrderEvent(String orderId, BigDecimal orderAmount, Instant orderDate)
        {
            this.orderId = orderId;
            this.orderAmount = orderAmount;
            if(orderDate==null)this.orderDate = Instant.now();
            else  this.orderDate = orderDate;
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
            if (!(o instanceof com.example.springEvents.event.OrderEvent order)) return false;
            return Objects.equals(getOrderId(), order.getOrderId());
        }
        @Override
        public int hashCode() {
            return Objects.hashCode(getOrderId());
        }

        @Override
        public String toString() {
            return "Order{" +
                    "orderId='" + orderId + '\'' +
                    ", orderAmount=" + orderAmount +
                    ", orderDate=" + orderDate +
                    '}';
        }
        public static OrderEvent createOrderEvent(Order order)
        {
            return new OrderEvent(order.getOrderId(), order.getOrderAmount(), order.getOrderDate());
        }

}
