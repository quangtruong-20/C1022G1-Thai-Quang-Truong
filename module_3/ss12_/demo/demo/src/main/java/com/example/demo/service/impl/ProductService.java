package com.example.demo.service.impl;


import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;
import com.example.demo.repository.impl.ProductRepository;
import com.example.demo.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
