package com.example.casestudy.service.impl;

import com.example.casestudy.model.Product;
import com.example.casestudy.repository.IProductRepository;
import com.example.casestudy.repository.impl.ProductRepository;
import com.example.casestudy.service.IProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {
           private IProductRepository iProductRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void insert(Product product) {
        iProductRepository.insert(product);
    }

    @Override
    public Product findById(int id_sp) {
        return iProductRepository.findById(id_sp);
    }

    @Override
    public void delete(int id_sp) throws SQLException {
        iProductRepository.delete(id_sp);
    }

    @Override
    public void update(Product product) throws SQLException {
        iProductRepository.update(product);
    }
}
