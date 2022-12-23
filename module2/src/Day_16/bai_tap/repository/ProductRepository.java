package Day_16.bai_tap.repository;

import Day_16.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public  static List<Product> productList = new ArrayList<>();
    static  {
        productList.add(new Product("1", "milk", "vinamilk", 20000, "white color"));
        productList.add(new Product("2", "cocacola", "vinamilk", 11000, "black color"));
        productList.add(new Product("3", "pepsi", "vinamilk", 21000, "red color"));
    }
    @Override
    public void addProduct(Product product) {
       productList.add(product);
    }

    @Override
    public void display() {
        for (Product product : productList
        ) {
            System.out.println(product.toString());
        }
    }

    @Override
    public Product findByCode(String code) {
        for (Product c: productList) {
            if (c.getCode() == code){
                return c;
            }
        }
        return null;
    }
    }



