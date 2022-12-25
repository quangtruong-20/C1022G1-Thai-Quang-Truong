package Day_11_JavaCollectionFramework.bai_tap.service;

import Day_11_JavaCollectionFramework.bai_tap.model.Product1;
import Day_11_JavaCollectionFramework.bai_tap.repository.IProductRepository;
import Day_11_JavaCollectionFramework.bai_tap.repository.ProductRepository;

public class ProductService implements IProductService {

    private final IProductRepository repository = new ProductRepository();

    @Override
    public void findAll() {
        repository.findAll();
    }

    @Override
    public void add(Product1 product) {
        repository.add(product);
    }

    @Override
    public Product1 findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(Product1 product) {
       repository.update(product);
    }


    @Override
    public void deleteProduct(int id) {
        repository.deleteProduct(id);
    }
//
//
//
    @Override
    public void findProduct(String name) {
        repository.findProduct(name);
    }
//
    @Override
    public void sortProduct() {
        repository.sortProduct();
    }


}
