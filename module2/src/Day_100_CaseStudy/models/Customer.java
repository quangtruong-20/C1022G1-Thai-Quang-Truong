package Day_100_CaseStudy.models;



public class Customer extends Person {
    private  String customerId;
    private String typeOfCustomer;
    private String address;


    public Customer(String customerId, String name, String birthDate, String gender, String identificationNumber, String address, String phoneNumber,
                    String email, String typeOfCustomer) {
        super(identificationNumber, name, birthDate, gender, phoneNumber, email);
        this.customerId = customerId;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }



    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
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
                "customerId=" + customerId +  ", name= "+getName() +" , phoneNumber= "
                + getPhoneNumber() +" ,dateOfBirth: "+ getBirthDate() +", gender: " + getGender()
                + ", identityNumber: "+ getIdentificationNumber()+
                ", typeOfCustomer=" + typeOfCustomer +
                ", address='" + address + '\'' +
                "} " ;
    }
}
