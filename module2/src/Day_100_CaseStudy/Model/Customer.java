package Day_100_CaseStudy.Model;

public class Customer {
    private int customerId;
    private String name;
    private int dayOfBirth;
    private String sex;
    private int cmnd;
    private int phone;
    private String email;
    private String typeOfCustomer;
    private String adress;

    public Customer() {
    }

    public Customer(int customerId, String name, int dayOfBirth, String sex, int cmnd, int phone, String email, String typeOfCustomer, String adress) {
        this.customerId = customerId;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.sex = sex;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.adress = adress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", sex='" + sex + '\'' +
                ", cmnd=" + cmnd +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }


}
enum TypeOfCustomer {
    Diamond, Platinium, Gold, Silver, Member
}