package Day_100_CaseStudy.utils;

import Day_100_CaseStudy.models.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CustomerFile {
    private static final String CUSTOMER_PATH = "D:\\codegym\\module2\\src\\Day_100_CaseStudy\\data\\customer.csv";

    public static List<Customer> readCustomer() {
        List<Customer> customerList = new LinkedList<>();
        FileReader fileReader = null;
        BufferedReader buff = null;

        try {
            fileReader = new FileReader(CUSTOMER_PATH);
            buff = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;

            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                String id = temp[0];
                String name = temp[1];
                String date = temp[2];
                String gender = temp[3];
                String identificationNumber = temp[4];
                String address = temp[5];

                String phoneNumber = temp[6];
                String email = temp[7];
                String typeOfCustomer = temp[8];

                customer = new Customer(id, name, date, gender, identificationNumber, address, phoneNumber, email, typeOfCustomer);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return customerList;
    }

    public static void writeCustomer(List<Customer> customer) {
        try {
            FileWriter fileWriter = new FileWriter(CUSTOMER_PATH);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            for (Customer e : customer) {
                buff.write(e.getCustomerId() + "," + e.getName() + "," + e.getBirthDate() + ","
                        + e.getGender() + "," + e.getIdentificationNumber() + "," + e.getAddress() + "," + e.getPhoneNumber() + ","
                        + e.getEmail() + ","
                        + e.getTypeOfCustomer());
            }

            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
