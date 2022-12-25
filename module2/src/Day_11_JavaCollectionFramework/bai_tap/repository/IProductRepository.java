package Day_11_JavaCollectionFramework.bai_tap.repository;

import Day_11_JavaCollectionFramework.bai_tap.model.Product1;

public interface IProductRepository {
    void findAll();
     //hàm sửa thông tin
    Product1 findById(int id);
    void  update(Product1 product);
    // ..........................
    void add(Product1 product);
    void deleteProduct(int id);
    void findProduct(String name);
    void sortProduct();
}
