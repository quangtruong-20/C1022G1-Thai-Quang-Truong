package Day_100_CaseStudy.Service.impl;

import Day_100_CaseStudy.Model.Employee;
import Day_100_CaseStudy.Model.Person;
import Day_100_CaseStudy.Service.IEmployeeService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    public static List<Employee> employeeList = new ArrayList<>();


    static {
        employeeList.add(new Employee("1","Thái Quang Trường", LocalDate.of(2000,9,1), Person.Gender.MALE,"1234335345","0946197716","truongtq@gmail.com", Employee.Education.UNIVERSITY, Employee.Position.MANAGER,50000000));
        employeeList.add(new Employee("2","Võ Ngọc Huân", LocalDate.of(2000,3,25), Person.Gender.MALE,"345367567","092345652","ngochuana@gmail.com", Employee.Education.COLLEGE, Employee.Position.DIRECTOR,10000000));
        employeeList.add(new Employee("3","Nguyễn Văn Khải", LocalDate.of(2000,3,30), Person.Gender.MALE,"7897345123","09453568778","vankhai@gmail.com", Employee.Education.INTERMEDIATE, Employee.Position.RECEPTIONIST,11000000));
    }


    @Override
    public void displayEmployee() {
        for (Employee c: employeeList
             ) {
            System.out.println(c);
        }
    }
}
