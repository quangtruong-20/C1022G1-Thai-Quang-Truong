package Day_100_CaseStudy.Model;

import java.time.LocalDate;

public class Employee extends Person {
    private int employeeId;
    private Education education;
    private Position position;
    private double salary;


    public Employee(int employeeId, String name, LocalDate birthDate, Gender gender
            ,String identificationNumber, String phoneNumber, String email, Education education,
                    Position position, double salary) {
        super(identificationNumber, name, birthDate, gender, phoneNumber, email);
        this.employeeId = employeeId;
        this.education = education;
        this.position = position;
        this.salary = salary;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int    employeeId) {
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
                "employeeId='" + employeeId + '\'' + ", name= "+getName() +" , phoneNumber= "+ getPhoneNumber() +" ,dateOfBirth: "+ getBirthDate() +", gender: " + getGender()+ ", identityNumber: "+ getIdentificationNumber()+
                ", education=" + education +
                ", position=" + position +
                ", salary=" + salary +
                '}';
}
 public enum Education {
    INTERMEDIATE, COLLEGE, UNIVERSITY, POSTGRADUATE
}

 public enum Position {
    RECEPTIONIST, SERVER, SPECIALIST, SUPERVISOR, MANAGER, DIRECTOR
}
    }
