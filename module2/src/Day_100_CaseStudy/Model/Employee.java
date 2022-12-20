package Day_100_CaseStudy.Model;

import java.util.Date;

public class Employee extends Person {
    private String employeeId;
    private Education education;
    private Position position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, Date birthDate, String gender, int identificationNumber, int phoneNumber, String email, String employeeId, Education education, Position position, double salary) {
        super(name, birthDate, gender, identificationNumber, phoneNumber, email);
        this.employeeId = employeeId;
        this.education = education;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", education=" + education +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
 enum Education {
    INTERMEDIATE, COLLEGE, UNIVERSITY, POSTGRADUATE
}

 enum Position {
    RECEPTIONIST, SERVER, SPECIALIST, SUPERVISOR, MANAGER, DIRECTOR
}