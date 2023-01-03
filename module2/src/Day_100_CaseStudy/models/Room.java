package Day_100_CaseStudy.models;


public class Room extends Facility {
    private String freeServiceIncluded;

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String name, String area, String price, String maxCapacity, String rentType ,
                String freeServiceIncluded) {
        super(name, area, price, maxCapacity, rentType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return
                "FreeServiceIncluded='" + freeServiceIncluded + '\'' +
              super.toString();
    }

    @Override
    public String toStringCSV() {
        return super.toStringCSV() + "," + this.freeServiceIncluded;
    }
}
