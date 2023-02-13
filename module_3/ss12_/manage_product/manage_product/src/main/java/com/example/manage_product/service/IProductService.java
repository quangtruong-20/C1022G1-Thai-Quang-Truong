package com.example.manage_product.service;

import com.example.manage_product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
}
