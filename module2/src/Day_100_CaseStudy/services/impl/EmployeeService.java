package Day_100_CaseStudy.services.impl;

import Day_100_CaseStudy.models.Employee;

import Day_100_CaseStudy.services.IEmployeeService;
import Day_100_CaseStudy.utils.EmployeeFile;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService, Serializable {
    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("1", "Thái Quang Trường", "new Date(1, 9, 2000)","male", "1234335345", "0946197716", "truongtq@gmail.com", "UNIVERSITY", "MANAGER", "50000000"));
        employeeList.add(new Employee("2", "Võ Ngọc Huân", "new Date(2000, 3, 25)", "male", "345367567", "092345652", "ngochuana@gmail.com", "COLLEGE","DIRECTOR", "10000000"));
        employeeList.add(new Employee("3", "Nguyễn Lê Văn Khải", "new Date(2000, 3, 30)","male", "7897345123", "09453568778", "vankhai@gmail.com", "INTERMEDIATE", "RECEPTIONIST", "11000000"));
        try {
            EmployeeFile.writeEmployeeList(employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @Override
    public void displayEmployee() {
        for (Employee c : employeeList) {
            System.out.println(c);
        }
    }

    @Override
    public void addEmployee(Employee employee) throws IOException {
        employeeList.add(employee);
        EmployeeFile.writeEmployeeList(employeeList);
    }

    @Override
    public Employee findById(String id) {
        for (Employee c : employeeList) {
            if (c.getEmployeeId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) throws IOException {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employee.getEmployeeId() == employeeList.get(i).getEmployeeId()) {
                employeeList.set(i, employee);
                EmployeeFile.writeEmployeeList(employeeList);

                break;
            }
        }

    }

    @Override
    public void deleteById(String id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId() == id) {
                employeeList.remove(employeeList.get(i));
            }
        }
    }


}
