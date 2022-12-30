package Day_100_CaseStudy.services.impl;

import Day_100_CaseStudy.models.Employee;
import Day_100_CaseStudy.services.IEmployeeService;
import Day_100_CaseStudy.utils.EmployeeFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();



    @Override
    public void displayEmployee() {
        List<Employee> employeeList1 = EmployeeFile.readEmployee();
        for (Employee c : employeeList1) {
            System.out.println(c);
        }
    }

    @Override
    public void addEmployee(Employee employee) {
      List<Employee>  employeeList1 = EmployeeFile.readEmployee();
        employeeList1.add(employee);
        EmployeeFile.writeEmployee(employeeList1);
        employeeList1.clear();
    }

    @Override
    public Employee findById(String id) {
        List<Employee> employeeList1 = EmployeeFile.readEmployee();
        for (Employee c : employeeList1) {
            if (c.getEmployeeId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) {
        List<Employee> employeeList1 = EmployeeFile.readEmployee();
        for (int i = 0; i < employeeList1.size(); i++) {
            if (employee.getEmployeeId().equals( employeeList1.get(i).getEmployeeId())) {
                employeeList1.set(i, employee);
                break;
            }
        }
        EmployeeFile.writeEmployee(employeeList1);

    }

    @Override
    public void deleteById(String id) {
        List<Employee> employeeList1 = EmployeeFile.readEmployee();


        for (int i = 0; i < employeeList1.size(); i++) {
            if (employeeList1.get(i).getEmployeeId().equals(id)) {
                employeeList1.remove(employeeList1.get(i));
                EmployeeFile.writeEmployee(employeeList1);

            }
        }
        EmployeeFile.writeEmployee(employeeList1);

    }



}
