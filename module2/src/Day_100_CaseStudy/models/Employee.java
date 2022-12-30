package Day_100_CaseStudy.models;



public class Employee extends Person  {
    private String employeeId;
    private String education;
    private String position;
    private String salary;


    public Employee(String employeeId, String name, String birthDate, String gender
            , String identificationNumber, String phoneNumber, String email, String education,
                    String position, String salary) {
        super(identificationNumber, name, birthDate, gender, phoneNumber, email);
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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
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

