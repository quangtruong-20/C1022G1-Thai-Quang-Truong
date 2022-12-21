package Day_100_CaseStudy.Model;


import java.time.LocalDate;
import java.util.Date;

public abstract class Person {
    private String identificationNumber;
    private String name;
    private LocalDate birthDate;
    private Gender gender;
    private String phoneNumber;
    private String email;


    public Person() {
    }

    public Person(String identificationNumber, String name, LocalDate birthDate, Gender gender, String phoneNumber, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.identificationNumber = identificationNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", identificationNumber=" + identificationNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
}
public enum Gender {
    MALE,FEMALE
}
    }
