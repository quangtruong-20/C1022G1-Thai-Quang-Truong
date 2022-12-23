package Day_16.bai_tap.repository;

import Day_16.bai_tap.model.Product;

import java.io.IOException;

public interface IProductRepository {
    void addProduct(Product product) throws IOException;

    void display() throws IOException;

    Product findByCode(String code);

}
