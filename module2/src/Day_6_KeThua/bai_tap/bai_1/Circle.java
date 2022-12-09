package Day_6_KeThua.bai_tap.bai_1;

public class Circle {
    private double radius;
    private String colors;

    public Circle(double radius, String colors) {
        this.colors = colors;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String isColors() {
        return colors;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", colors=" + getColors() + " ,Area: " + getArea() +
                '}';
    }
}

class Cylinder extends Circle {
    private final double height;

    public Cylinder(double radius, String colors, double height) {
        super(radius, colors);
        this.height = height;
    }

    public double getVolume() {

        return getArea() * height;
    }

    public double getHeight() {

        return height;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "height= " + getHeight() + ", colors= " + getColors() + ", Volume= " + getVolume() +
                '}';
    }
}