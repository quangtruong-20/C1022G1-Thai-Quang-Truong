package Day_100_CaseStudy.models;


public class Room extends Facility {
    private String FreeServiceIncluded;

    public String getFreeServiceIncluded() {
        return FreeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        FreeServiceIncluded = freeServiceIncluded;
    }

    public Room(String name, String area, String price, String maxCapacity, String rentType ,
                String freeServiceIncluded) {
        super(name, area, price, maxCapacity, rentType);
        this.FreeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                ", Name='" + getName() + '\'' +
                ", Area=" + getArea() +
                ", Costs=" + getPrice() +
                ", maximumNumberOfPeople=" + getMaxCapacity() +
                ", rentalType='" + getRentType() + '\'' +
                "FreeServiceIncluded='" + FreeServiceIncluded + '\''
                +
                '}';
    }
}
