package Day_7_AbstractClass_Interface.bai_tap.Resizeable;

public class Rectangle extends Shape implements IResizeable {

    private int height;
    private int width;


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
    public void resize(double percent) {
        this.height *= percent;
        this.width *= percent;
    }


    @Override
    public double getArea() {
        return this.width*this.height;
    }
}
