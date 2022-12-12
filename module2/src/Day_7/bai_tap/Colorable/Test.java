package Day_7.bai_tap.Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(5);
        shapes[1] = new Rectangle(6, 8);


        for (Shape elemnt : shapes) {

            System.out.println("name: "+ elemnt.getName() + ", diện tích là: " + elemnt.getArea());
            if (elemnt instanceof IColorable){
                ((IColorable) elemnt).howToColor();
            }
        }

    }
}
