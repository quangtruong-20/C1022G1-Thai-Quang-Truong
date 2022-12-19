package Day_11.bai_tap.repository;

import Day_11.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {
 public   static   List<Product> productList = new ArrayList<>();
   static  {
        productList.add(new Product("Trà", 1, 20));
        productList.add(new Product("C2", 2, 21));
        productList.add(new Product("Bò húc", 3, 22));
        productList.add(new Product("Oxi", 4, 23));
    }




    @Override
    public void findAll() {
        for (Product product : productList
                ) {
            System.out.println(product.toString());
        }
    }

    @Override
    public Product findById(int id) {
        for (Product c: productList) {
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < productList.size() ; i++) {
            if (product.getId() == productList.get(i).getId()){
                productList.set(i,product);
                break;
            }
        }
    }

    @Override
    public void add(Product product) {
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
    public void findProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(name)) {
                System.out.println(productList.get(i));
            }
        }

    }
    @Override
    public void sortProduct() {
        Collections.sort(productList);
Collections.reverse(Collections.singletonList(productList));
    }


}