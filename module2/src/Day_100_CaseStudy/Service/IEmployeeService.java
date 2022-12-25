package Day_100_CaseStudy.Service;

import Day_100_CaseStudy.Model.Employee;

public interface IEmployeeService extends IService {
    public void displayEmployee();
    public void addEmployee(Employee employee );


    Employee findById(int id);
    void updateEmployee(Employee employee);

    void  deleteById(int id);
}
