package Day_100_CaseStudy.Model;

import Day_100_CaseStudy.Model.enum_model.RentType;

public class Villa extends Facility {
        private String roomStandard;
        private double swimmingPoolArea;
        private int numberOfFloors;

    public Villa(String name, double area, double price, int maxCapacity, RentType rentType) {
        super(name, area, price, maxCapacity, rentType);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
