package Day_16.bai_tap.repository;

import Day_16.bai_tap.model.Product;

public interface IProductRepository {
    void addProduct(Product product);

    void display();

    Product findByCode(String code);

}
