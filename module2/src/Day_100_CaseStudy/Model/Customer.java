package Day_100_CaseStudy.Model;

import java.util.Date;

public class Customer extends Person{
    private int customerId;
    private String typeOfCustomer;
    private String address;

    public Customer() {
    }

    public Customer(int customerId, String typeOfCustomer, String address) {
        this.customerId = customerId;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String name, Date birthDate, String gender, int identificationNumber, int phoneNumber, String email, int customerId, String typeOfCustomer, String address) {
        super(name, birthDate, gender, identificationNumber, phoneNumber, email);
        this.customerId = customerId;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }





    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", adress='" + address + '\'' +
                '}';
    }
}
enum TypeOfCustomer {
    DIAMOND, PLATINIUM, GOLD, SILVER, MEMBER
}