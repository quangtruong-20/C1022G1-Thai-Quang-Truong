package com.example.casestudy.service.impl;

import com.example.casestudy.model.Product;
import com.example.casestudy.repository.IProductRepository;
import com.example.casestudy.repository.impl.ProductRepository;
import com.example.casestudy.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
            IProductRepository iProductRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        return iProductRepository.;
    }
}
