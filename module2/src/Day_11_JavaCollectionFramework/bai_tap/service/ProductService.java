package Day_11_JavaCollectionFramework.bai_tap.service;

import Day_11_JavaCollectionFramework.bai_tap.model.Product;
import Day_11_JavaCollectionFramework.bai_tap.repository.IProductRepository;
import Day_11_JavaCollectionFramework.bai_tap.repository.ProductRepository;

public class ProductService implements IProductService {

    private final IProductRepository repository = new ProductRepository();

    @Override
    public void findAll() {
        repository.findAll();
    }

    @Override
    public void add(Product product) {
        repository.add(product);
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(Product product) {
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
