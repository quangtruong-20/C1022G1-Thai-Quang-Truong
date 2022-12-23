package Day_16.bai_tap.service;

import Day_16.bai_tap.model.Product;

import java.io.IOException;

public interface IProductService {

    void addProduct(Product product) throws IOException;

    void display() throws IOException;

    void findByCode(String code);

}
