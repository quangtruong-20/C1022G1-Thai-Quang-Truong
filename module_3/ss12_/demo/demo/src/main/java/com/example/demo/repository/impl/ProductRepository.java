package com.example.demo.repository.impl;



import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IProductRepository {
    private static Map<Integer, Product> products = new HashMap<>();
    static {
        products.put(1,new Product(1,"bia","12000","heniken","vietnam"));
        products.put(2,new Product(2,"cocacola","12000","big size","vietnam"));
        products.put(3,new Product(3,"pepsi","12000","small size","vietnam"));
        products.put(4,new Product(4,"codegym","12000","good","vietnam"));
        products.put(5,new Product(5,"book","12000","o li","vietnam"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
products.put(product.getId(),product);
    }

    @Override
    public Product findByName(String name) {
        return products.get(name);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
