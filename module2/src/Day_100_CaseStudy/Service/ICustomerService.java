package Day_100_CaseStudy.Service;

import Day_100_CaseStudy.Model.Customer;
import Day_100_CaseStudy.Model.Employee;

public interface ICustomerService extends IService {

    void displayCustomer();

    void addNewCustomer(Customer customer);


    Customer findCustomerById(int id);
    void updateCustomer(Customer customer);


}
