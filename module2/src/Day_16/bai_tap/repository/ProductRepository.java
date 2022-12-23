package Day_16.bai_tap.repository;

import Day_16.bai_tap.model.Product;
import Day_16.bai_tap.ulti.ProductFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public  static List<Product> productList = new ArrayList<>();
    static  {
        productList.add(new Product("1", "milk", "vinamilk", 20000, "white color"));
        productList.add(new Product("2", "cocacola", "vinamilk", 11000, "black color"));
        productList.add(new Product("3", "pepsi", "vinamilk", 21000, "red color"));
        try {
            ProductFile.writeObjectList(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void addProduct(Product product) throws IOException {
       productList.add(product);
        ProductFile.writeObjectList(productList);
    }

    @Override
    public void display() throws IOException {
        for (Product product : productList
        ) {
            System.out.println(product.toString());
            ProductFile.writeObjectList(productList);
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



