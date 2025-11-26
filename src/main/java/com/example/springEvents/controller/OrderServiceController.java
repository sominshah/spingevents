package com.example.springEvents.controller;
import com.example.springEvents.model.Order;
import com.example.springEvents.service.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class OrderServiceController
{
    @Autowired
    private OderService orderService;

    @PostMapping("/orders")
    public ResponseEntity<Order> add(@RequestBody Order order)
    {
        orderService.addOrder(order);
        return ResponseEntity.ok(order);
    }
    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getOrders()
    {
        return ResponseEntity.ok(orderService.getOrders());
    }

}
