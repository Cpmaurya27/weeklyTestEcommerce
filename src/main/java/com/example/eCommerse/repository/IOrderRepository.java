package com.example.eCommerse.repository;

import com.example.eCommerse.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends CrudRepository<Order, Integer> {
}
