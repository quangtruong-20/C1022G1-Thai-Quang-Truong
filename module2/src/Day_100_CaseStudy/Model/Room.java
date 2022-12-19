package Day_100_CaseStudy.Model;

public class Room extends Facility {
    private String FreeServiceIncluded;

    public String getFreeServiceIncluded() {
        return FreeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        FreeServiceIncluded = freeServiceIncluded;
    }

    public Room(String name, double area, double price, int maxCapacity, RentType rentType , String freeServiceIncluded) {
        super(name, area, price, maxCapacity, rentType);
        this.FreeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "FreeServiceIncluded='" + FreeServiceIncluded + '\'' +
                '}';
    }
}
