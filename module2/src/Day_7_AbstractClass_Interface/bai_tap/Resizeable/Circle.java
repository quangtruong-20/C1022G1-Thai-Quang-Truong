package Day_7_AbstractClass_Interface.bai_tap.Resizeable;

public class Circle extends Shape  implements IResizeable{


    private double radius;



    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }




    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                " ,Area: " + getArea() +
                '}';
    }
    @Override
    public void resize(double percent) {
        this.radius *= percent;
    }

}
