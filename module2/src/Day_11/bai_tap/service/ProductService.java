package Day_11.bai_tap.service;

import Day_11.bai_tap.model.Product;
import Day_11.bai_tap.repository.IProductRepository;
import Day_11.bai_tap.repository.ProductRepository;

public class ProductService implements IProductService {

    private final IProductRepository repository = new ProductRepository();

    @Override
    public void findAll() {
        repository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public void deleteProduct(int id) {
        repository.deleteProduct(id);
    }


    @Override
    public void editInformation(int index, Product product) {
        repository.editInformation(index, product);
    }

    @Override
    public void findProduct(String name) {
        repository.findProduct(name);
    }

    @Override
    public void sortProduct() {
        repository.sortProduct();
    }


}
