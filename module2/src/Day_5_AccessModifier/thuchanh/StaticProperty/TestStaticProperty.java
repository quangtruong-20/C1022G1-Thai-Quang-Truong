package Day_5_AccessModifier.thuchanh.StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda","Honda");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Huda","Vip");

        System.out.println(Car.numberOfCars);

    }
}
