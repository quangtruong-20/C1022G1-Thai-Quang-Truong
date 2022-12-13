package Day_7_AbstractClass_Interface.bai_tap.Colorable;

public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
            return this.width*this.height ;
    }
}

