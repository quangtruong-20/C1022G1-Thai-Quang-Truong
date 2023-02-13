package com.example.demo.repository;


import com.example.demo.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void save(Product product);

    Product findByName(String name);

    void update(int id, Product product);

    void remove(int id);
}
