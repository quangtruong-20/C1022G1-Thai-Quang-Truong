package Day_100_CaseStudy.Service.impl;

import Day_100_CaseStudy.Model.*;
import Day_100_CaseStudy.Model.enum_model.Education;
import Day_100_CaseStudy.Model.enum_model.Gender;
import Day_100_CaseStudy.Model.enum_model.Position;
import Day_100_CaseStudy.Service.IEmployeeService;

import java.util.ArrayList;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee(1,"Thái Quang Trường",new Date(1,9,2000), Gender.MALE,"1234335345","0946197716","truongtq@gmail.com", Education.UNIVERSITY, Position.MANAGER,50000000));
        employeeList.add(new Employee(2,"Võ Ngọc Huân", new Date(2000,3,25), Gender.MALE,"345367567","092345652","ngochuana@gmail.com", Education.COLLEGE, Position.DIRECTOR,10000000));
        employeeList.add(new Employee(3,"Nguyễn Văn Khải",new Date(2000,3,30), Gender.MALE,"7897345123","09453568778","vankhai@gmail.com", Education.INTERMEDIATE, Position.RECEPTIONIST,11000000));
    }


    @Override
    public void displayEmployee() {
        for (Employee c: employeeList
             ) {
            System.out.println(c);
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public Employee findById(int id) {
        for (Employee c: employeeList) {
            if (c.getEmployeeId() == id){
                return c;
            }
        }
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) {
        for (int i = 0; i < employeeList.size() ; i++) {
            if (employee.getEmployeeId() == employeeList.get(i).getEmployeeId()){
                employeeList.set(i,employee);
                break;
            }
        }

    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId() == id) {
                employeeList.remove(employeeList.get(i));
            }
        }
    }


}
