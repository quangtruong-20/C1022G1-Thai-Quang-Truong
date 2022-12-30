package Day_100_CaseStudy.services;

import Day_100_CaseStudy.models.Customer;

import java.io.IOException;

public interface ICustomerService {

    void displayCustomer() throws IOException;

    void addNewCustomer(Customer customer) throws IOException;

    Customer findCustomerById(String id);
    void updateCustomer(Customer customer);


}
