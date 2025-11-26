package com.example.springEvents.service;

import com.example.springEvents.event.OrderEvent;
import com.example.springEvents.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OderService
{
@Autowired
ApplicationEventPublisher applicationEventPublisher;

List<Order> orders = new ArrayList<>();
public  List<Order> getOrders()
{

    return orders;
}
public void addOrder(Order order)
{
    System.out.println("new Order is placed.");
    orders.add(order);
    applicationEventPublisher.publishEvent(OrderEvent.createOrderEvent(order));
    System.out.println("Order placed successfully.");
    System.out.println(Thread.currentThread().getName());
}
public void  removeOrder(Order order)
{
    orders.remove(order);
}
}
