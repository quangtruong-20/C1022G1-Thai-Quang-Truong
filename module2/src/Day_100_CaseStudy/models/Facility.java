package Day_100_CaseStudy.models;

import Day_100_CaseStudy.models.enum_model.RentType;

public class Facility {

         private String serviceName;
        private String area;
        private String price;
        private String maxCapacity;
        private RentType rentType;


        public Facility(String serviceName, String area, String price, String maxCapacity, RentType rentType) {
            this.serviceName = serviceName;
            this.area = area;
            this.price = price;
            this.maxCapacity = maxCapacity;
            this.rentType = rentType;
        }

        public String getName() {
            return serviceName;
        }

        public void setName(String serviceName) {
            this.serviceName = serviceName;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getMaxCapacity() {
            return maxCapacity;
        }

        public void setMaxCapacity(String maxCapacity) {
            this.maxCapacity = maxCapacity;
        }

        public RentType getRentType() {
            return rentType;
        }

        public void setRentType(RentType rentType) {
            this.rentType = rentType;
        }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxCapacity=" + maxCapacity +
                ", rentType=" + rentType +
                '}';
    }
}


