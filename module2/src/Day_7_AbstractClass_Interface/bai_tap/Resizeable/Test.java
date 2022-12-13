package Day_7_AbstractClass_Interface.bai_tap.Resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(5, 15);
        shapes[2] = new Square(5);


        Circle circle1 = (Circle) shapes[0];
        System.out.println("Diện tích hình tròn trước khi tăng là: " + circle1.getArea());
        circle1.resize(Math.random() * 100);
        System.out.println("Diện tích hình tròn sau khi tăng là: " + circle1.getArea());
        System.out.println("\n");



        Rectangle rectangle1 = (Rectangle) shapes[1];
        System.out.println("Diện tích hình chữ nhật trước khi tăng là: " + rectangle1.getArea());
        rectangle1.resize(Math.random() * 100);
        System.out.println("Diện tích hình chữ nhật sau khi tăng là: " + rectangle1.getArea());
        System.out.println("\n");

        Square square1 = (Square) shapes[2];
        System.out.println("Diện tích hình vuông trước khi tăng là: " + square1.getArea());
        rectangle1.resize(Math.random() * 100);
        System.out.println("Diện tích hình vuông sau khi tăng là: " + rectangle1.getArea());

    }


}
