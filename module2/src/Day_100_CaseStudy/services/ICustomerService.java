package Day_100_CaseStudy.services;

import Day_100_CaseStudy.models.Customer;

public interface ICustomerService extends IService {

    void displayCustomer();

    void addNewCustomer(Customer customer);

    Customer findCustomerById(String id);
    void updateCustomer(Customer customer);


}
