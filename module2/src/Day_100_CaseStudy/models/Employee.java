package Day_100_CaseStudy.models;


import Day_100_CaseStudy.models.enum_model.Education;
import Day_100_CaseStudy.models.enum_model.Gender;
import Day_100_CaseStudy.models.enum_model.Position;

public class Employee extends Person {
    private String employeeId;
    private Education education;
    private Position position;
    private String salary;


    public Employee(String employeeId, String name, Date birthDate, Gender gender
            , String identificationNumber, String phoneNumber, String email, Education education,
                    Position position, String salary) {
        super(identificationNumber, name, birthDate, gender, phoneNumber, email);
        this.employeeId = employeeId;
        this.education = education;
        this.position = position;
        this.salary = salary;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String    employeeId) {
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' + ", name= "+getName() +" , phoneNumber= "
                + getPhoneNumber() +" ,dateOfBirth: "+ getBirthDate() +", gender: " + getGender()
                + ", identityNumber: "+ getIdentificationNumber()+
                ", education=" + education +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}

