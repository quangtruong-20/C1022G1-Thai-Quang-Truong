package com.example.manage_product.service.impl;

import com.example.manage_product.model.Product;
import com.example.manage_product.repository.IProductRepository;
import com.example.manage_product.repository.impl.ProductRepository;
import com.example.manage_product.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
