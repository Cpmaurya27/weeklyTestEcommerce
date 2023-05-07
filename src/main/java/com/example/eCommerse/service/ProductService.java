package com.example.eCommerse.service;

import com.example.eCommerse.model.Product;
import com.example.eCommerse.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductRepository iProductRepository;


    public Product createProduct(Product product) {
        return iProductRepository.save(product);
    }

    public Optional<Product> getProductById(Integer id) {
        return iProductRepository.findById(id);
    }

    public List<Product> getAllProducts() {
        List<Product> product= (List<Product>) iProductRepository.findAll();
        return product;
    }

    public List<Product> getProductsByCategory(String category) {
        return iProductRepository.findByCategory(category);
    }

    public void deleteProductById(Integer id) {
        iProductRepository.deleteById(id);
    }
}
