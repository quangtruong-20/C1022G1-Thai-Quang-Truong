package Day_5_AccessModifier.baitap.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3);
        System.out.println("Bán kính 1" + circle1.getRadius());
        System.out.println("Đường kính 1 " + circle1.getArea());
        System.out.println("Đường kính 2 " + circle2.getArea());
        System.out.println("Đường kính 2 " + circle2.getArea());

    }
}
