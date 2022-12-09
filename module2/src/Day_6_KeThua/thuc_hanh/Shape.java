package Day_6_KeThua.thuc_hanh;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}

class Circles extends Shape {
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


class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle (){
        this.length =1.0;
        this.width =1.0;
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*this.length;
    }
    public double getPerimeter(){
        return 2*(width+this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " +
                getWidth()+" and length= "
                 + getLength() + ", which is a subclass of " + super.toString()
                ;
    }
}
