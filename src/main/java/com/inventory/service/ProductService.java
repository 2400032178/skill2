package com.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inventory.entity.Product;
import com.inventory.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public Product save(Product p) {
        return repo.save(p);
    }

    public Product getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}