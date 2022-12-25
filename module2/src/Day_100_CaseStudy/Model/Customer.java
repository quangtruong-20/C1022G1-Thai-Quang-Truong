package Day_100_CaseStudy.Model;


import Day_100_CaseStudy.Model.enum_model.Gender;
import Day_100_CaseStudy.Model.enum_model.TypeOfCustomer;

public class Customer extends Person{
    private int customerId;
    private TypeOfCustomer typeOfCustomer;
    private String address;


    public Customer( int customerId,String name,Date birthDate,Gender gender, String identificationNumber, String address,    String phoneNumber,
                    String email, TypeOfCustomer typeOfCustomer) {
        super(identificationNumber, name, birthDate, gender, phoneNumber, email);
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





    public TypeOfCustomer getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(TypeOfCustomer typeOfCustomer) {
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
                "customerId=" + customerId +  ", name= "+getName() +" , phoneNumber= "
                + getPhoneNumber() +" ,dateOfBirth: "+ getBirthDate() +", gender: " + getGender()
                + ", identityNumber: "+ getIdentificationNumber()+
                ", typeOfCustomer=" + typeOfCustomer +
                ", address='" + address + '\'' +
                "} " ;
    }
}
