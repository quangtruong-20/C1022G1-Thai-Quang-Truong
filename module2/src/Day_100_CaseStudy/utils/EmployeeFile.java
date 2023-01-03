package Day_100_CaseStudy.utils;


import Day_100_CaseStudy.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFile {
    private static final String EMPLOYEE_PATH = "src\\Day_100_CaseStudy\\data\\employee.csv";

    public static List<Employee> readEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader buff = null;

        try {
            fileReader = new FileReader(EMPLOYEE_PATH);
            buff = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;

            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                String id = temp[0];
                String name = temp[1];
                String date = temp[2];
                String gender = temp[3];
                String identificationNumber = temp[4];
                String phoneNumber = temp[5];
                String email = temp[6];
                String education = temp[7];
                String position = temp[8];
                String salary = temp[9];
                employee = new Employee(id, name, date, gender, identificationNumber, phoneNumber, email, education, position, salary);
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return employeeList;
    }

    public static void writeAppendEmployee(List<Employee> employee) {
        try {
            FileWriter fileWriter = new FileWriter(EMPLOYEE_PATH, true);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            for (Employee e : employee) {
                buff.write(e.getEmployeeId() + "," + e.getName() + "," + e.getBirthDate() + ","
                        + e.getGender() + "," + e.getIdentificationNumber() + "," + e.getPhoneNumber() + ","
                        + e.getEmail() + "," + e.getEducation() + "," + e.getPosition() + ","
                        + e.getSalary()+"\n");
            }

            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void writeEmployee(List<Employee> employee) {
        try {
            FileWriter fileWriter = new FileWriter(EMPLOYEE_PATH);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            for (Employee e : employee) {
                buff.write(e.getEmployeeId() + "," + e.getName() + "," + e.getBirthDate() + ","
                        + e.getGender() + "," + e.getIdentificationNumber() + "," + e.getPhoneNumber() + ","
                        + e.getEmail() + "," + e.getEducation() + "," + e.getPosition() + ","
                        + e.getSalary()+"\n");
                buff.newLine();
            }

            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}