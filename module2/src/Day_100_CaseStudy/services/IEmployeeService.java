package Day_100_CaseStudy.services;

import Day_100_CaseStudy.models.Employee;

import java.io.IOException;

public interface IEmployeeService {
    void displayEmployee();
     void addEmployee(Employee employee ) throws IOException;


    Employee findById(String id);
    void updateEmployee(Employee employee) throws IOException;

    void  deleteById(String id);
}
