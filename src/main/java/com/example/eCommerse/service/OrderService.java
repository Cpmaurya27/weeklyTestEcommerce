package com.example.eCommerse.service;

import com.example.eCommerse.model.Order;
import com.example.eCommerse.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepository iOrderRepository;

    public Order createOrder(Order order) {
        return iOrderRepository.save(order);
    }

    public Optional<Order> getOrderById(Integer id) {
        return iOrderRepository.findById(id);
    }
}
