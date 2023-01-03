package Day_100_CaseStudy.services.impl;

import Day_100_CaseStudy.models.Customer;

import Day_100_CaseStudy.services.ICustomerService;
import Day_100_CaseStudy.utils.CustomerFile;

import java.util.LinkedList;
import java.util.List;

public class CustomerService implements ICustomerService {

    public static List<Customer> customerList = new LinkedList<>();


    @Override
    public void displayCustomer()  {
        List<Customer> customerList1 = CustomerFile.readCustomer();
        for (Customer c : customerList1
        ) {
            System.out.println(c);
        }

    }

    @Override
    public void addNewCustomer(Customer customer)  {
        List<Customer> customerList1 = CustomerFile.readCustomer();
        customerList1.add(customer);
        CustomerFile.writeCustomer(customerList1);
        customerList1.clear();
    }

    @Override
    public Customer findCustomerById(String id) {
        List<Customer> customerList1 = CustomerFile.readCustomer();
        for (Customer c : customerList1
        ) {
            if (c.getCustomerId().equals( id)) {
                return c;

            }
        }


        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {
        List<Customer> customerList1 = CustomerFile.readCustomer();
        for (int i = 0; i < customerList1.size(); i++) {
            if (customer.getCustomerId().equals(customerList1.get(i).getCustomerId())) {
                customerList1.set(i, customer);
            break;
            }
        }
        CustomerFile.writeCustomer(customerList1);
    }


}
