package Day_16.bai_tap.service;

import Day_16.bai_tap.model.Product;

public interface IProductService {

    void addProduct(Product product);

    void display();

    void findByCode(String code);

}
