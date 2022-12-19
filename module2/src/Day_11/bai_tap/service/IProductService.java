package Day_11.bai_tap.service;

import Day_11.bai_tap.model.Product;

public interface IProductService {

    void findAll();
    void addProduct(Product product);
    void deleteProduct(int id);
    void editInformation(int index,Product product);
    void findProduct(String name);
    void sortProduct();

}
