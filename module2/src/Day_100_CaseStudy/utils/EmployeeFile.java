package Day_100_CaseStudy.utils;


import Day_100_CaseStudy.models.Employee;
import java.io.*;
import java.util.List;

public class EmployeeFile {
    private static final String EMPLOYEE_PATH = "D:\\codegym\\module2\\src\\Day_100_CaseStudy\\data\\employee.csv";
    public static void writeEmployeeList(List<Employee> employeeList) throws IOException {
        FileOutputStream fos = new FileOutputStream(EMPLOYEE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employeeList);
        oos.close();
    }
    public static List<Employee> readEmployeeList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(EMPLOYEE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Employee> employeeList = (List<Employee>) ois.readObject();
        return employeeList;
    }
}
