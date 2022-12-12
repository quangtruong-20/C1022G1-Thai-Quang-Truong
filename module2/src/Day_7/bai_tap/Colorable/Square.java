package Day_7.bai_tap.Colorable;

public class Square extends Shape implements IColorable {
    private int height;

    public Square() {
    }

    public Square(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getName() {
        return "Square";
    }

    public double getArea(){
        return this.height* this.height;
    }



    @Override
    public void howToColor() {
        System.out.println("Color all four sides...");
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                '}';
    }
}
