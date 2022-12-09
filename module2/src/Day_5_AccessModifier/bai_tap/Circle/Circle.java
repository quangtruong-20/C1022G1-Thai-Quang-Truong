package Day_5_AccessModifier.bai_tap.Circle;

public class Circle {
    private double radius = 1.0;
    private final String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        radius = r;
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return this.radius * this.radius * 3.14;
    }
}
