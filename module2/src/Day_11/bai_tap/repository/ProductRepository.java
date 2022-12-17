package Day_11.bai_tap.repository;

import Day_11.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {
    Product product1 = new Product("Trà", 1, 20);
    Product product2 = new Product("C2", 2, 21);
    Product product3 = new Product("Bò húc", 3, 22);
    Product product4 = new Product("Oxi", 4, 23);

    List<Product> productList = new ArrayList<>();

    {
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
    }


    @Override
    public void findAll() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void deleteProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(productList.get(i));
            }
        }
    }

    @Override
    public void editInformation(int index, Product product) {

        productList.set(index, product);
    }

    @Override
    public void findProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(name)) {
                System.out.println(productList.get(i));
            }
        }


    }

    @Override
    public void sortProduct() {

        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId() - o2.getId();
            }
        });
    }

}