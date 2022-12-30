package Day_100_CaseStudy.models;


public class Villa extends Facility {
        private String roomStandard;
        private String swimmingPoolArea;
        private String numberOfFloors;

    public Villa(String serviceName, String area, String price, String maxCapacity, String rentType,
                 String roomStandard, String swimmingPoolArea, String numberOfFloors) {
        super(serviceName, area, price, maxCapacity, rentType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                  "Name='" + getName() + '\'' +
                ", Area=" + getArea() +
                ", Costs=" + getPrice() +
                ", maximumNumberOfPeople=" + getMaxCapacity() +
                ", rentalType='" + getRentType() + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
