package Day_100_CaseStudy.utils;

import Day_100_CaseStudy.models.Customer;

import java.io.*;
import java.util.List;

public class CustomerFile {
    private static final String CUSTOMER_PATH = "D:\\codegym\\module2\\src\\Day_100_CaseStudy\\data\\customer.csv";
    public static void writeCustomerList(List<Customer> customerServiceList) throws IOException {
        FileOutputStream fos = new FileOutputStream(CUSTOMER_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(customerServiceList);
        oos.close();
    }
    public static List<Customer> readCustomerList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(CUSTOMER_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Customer> customerServiceList = (List<Customer>) ois.readObject();
        return customerServiceList;
    }
}
