package com.example.eCommerse.controller;

import com.example.eCommerse.model.Order;
import com.example.eCommerse.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/addOrder")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping(value = "/getOrderById/{id}")
    public Optional<Order> getOrderById(@PathVariable Integer id) {
        return orderService.getOrderById(id);
    }
}
