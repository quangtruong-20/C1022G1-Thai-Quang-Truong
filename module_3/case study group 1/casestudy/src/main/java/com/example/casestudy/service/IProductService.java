package com.example.casestudy.service;

import com.example.casestudy.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void insert(Product product);
    Product findById(int id_sp);
    void delete(int id_sp) throws SQLException;
    void update(Product product) throws SQLException;

}
