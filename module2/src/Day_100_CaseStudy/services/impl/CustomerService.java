package Day_100_CaseStudy.services.impl;

import Day_100_CaseStudy.models.Customer;
import Day_100_CaseStudy.models.Date;
import Day_100_CaseStudy.models.enum_model.Gender;
import Day_100_CaseStudy.models.enum_model.TypeOfCustomer;
import Day_100_CaseStudy.services.ICustomerService;
import Day_100_CaseStudy.utils.CustomerFile;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CustomerService implements ICustomerService {

    public static List<Customer> customerList = new LinkedList<>();

    static {
        customerList.add(new Customer("121", "Tran gia han", new Date(20, 7, 2001), Gender.MALE, "234234234234", "quang binh", "0234234234", "thaiquangtruong@gmail.com", TypeOfCustomer.DIAMOND));
        customerList.add(new Customer("122", "Tran van em", new Date(20, 7, 2001), Gender.FEMALE, "52434535345", "quang tri", "09278346278", "tranvanduy@gmail.com", TypeOfCustomer.GOLD));
        customerList.add(new Customer("123", "Tran van anh", new Date(20, 7, 2001), Gender.MALE, "68678678678564", "quang ngai", "02926348723", "thaithiluyen@gmail.com", TypeOfCustomer.PLATINIUM));
        try {
            CustomerFile.writeCustomerList(customerList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void displayCustomer() {
        for (Customer c : customerList
        ) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public Customer findCustomerById(String id) {
        for (Customer c : customerList
        ) {
            if (c.getCustomerId() == id) {
                return c;

            }
        }


        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customer.getCustomerId() == customerList.get(i).getCustomerId()) {
                customerList.set(i, customer);
            }
        }
    }


}
