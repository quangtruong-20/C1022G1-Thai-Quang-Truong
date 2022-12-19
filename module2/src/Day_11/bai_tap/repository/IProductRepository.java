package Day_11.bai_tap.repository;

import Day_11.bai_tap.model.Product;

public interface IProductRepository {
    void findAll();
     //hàm sửa thông tin
    Product findById( int id);
    void  update(Product product);
    // ..........................
    void add(Product product);
    void deleteProduct(int id);
    void findProduct(String name);
    void sortProduct();
}
