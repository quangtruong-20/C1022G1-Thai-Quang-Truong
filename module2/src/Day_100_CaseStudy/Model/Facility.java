package Day_100_CaseStudy.Model;

abstract class Facility {

         private String serviceName;
        private double area;
        private double price;
        private int maxCapacity;
        private RentType rentType;


        public Facility(String serviceName, double area, double price, int maxCapacity, RentType rentType) {
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

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getMaxCapacity() {
            return maxCapacity;
        }

        public void setMaxCapacity(int maxCapacity) {
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

    enum RentType {
        YEAR, MONTH, DAY
    }


