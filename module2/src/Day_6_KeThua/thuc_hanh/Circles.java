package Day_6_KeThua.thuc_hanh;

public class Circles extends Shape {
    private double radius;

    public Circles() {
        this.radius = 1;
    }

    public Circles(double radius) {
        this.radius = radius;
    }

    public Circles(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circles with radius= " +
                getRadius() +
                ", which is a subclass of " + super.toString();
    }
}

