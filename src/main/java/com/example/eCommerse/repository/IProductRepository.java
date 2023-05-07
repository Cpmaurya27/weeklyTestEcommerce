package com.example.eCommerse.repository;

import com.example.eCommerse.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findByCategory(String category);
}
