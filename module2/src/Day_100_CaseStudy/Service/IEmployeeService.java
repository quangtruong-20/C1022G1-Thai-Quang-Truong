package Day_100_CaseStudy.Service;

import Day_100_CaseStudy.Model.Employee;

public interface IEmployeeService extends IService {
    public void displayEmployee();
    public void addEmployee(Employee employee );
//    // chỉnh sửa thông tin,
//
//    Employee findById(String id);
//    void updateEmployee(Employee employee);
}
