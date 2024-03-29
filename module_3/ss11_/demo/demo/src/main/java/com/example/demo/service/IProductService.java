package com.example.demo.service;



import com.example.demo.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);

    List<Product> findByName(String name);
    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
