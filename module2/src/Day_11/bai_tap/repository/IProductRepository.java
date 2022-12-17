package Day_11.bai_tap.repository;

import Day_11.bai_tap.model.Product;

public interface IProductRepository {
    void findAll();
    void  addProduct(Product product);
    void deleteProduct(int id);
    void editInformation(int index,Product product);
    void findProduct(String name);
    void sortProduct();
}
