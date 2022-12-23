package Day_16.bai_tap.ulti;

import Day_16.bai_tap.model.Product;


import java.io.*;
import java.util.List;

public class ProductFile {
    private static final String FILE_PATH = "D:\\codegym\\module2\\src\\Day_16\\bai_tap\\product.dat";
    public static void writeObjectList(List<Product> product1List) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(product1List);
        oos.close();
    }
    public static List<Product> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Product> product1List = (List<Product>) ois.readObject();
        return product1List;
    }
}
