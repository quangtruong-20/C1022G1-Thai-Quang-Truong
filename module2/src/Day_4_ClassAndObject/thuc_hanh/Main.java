package Day_4_ClassAndObject.thuc_hanh;


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
            System.out.println("nhập chiều rộng: ");
            double width = scanner.nextDouble();
            System.out.println("nhập chiều dài: ");
            double height = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(width,height);
            System.out.println("Hình chữ nhật là: "+ rectangle.display());
            System.out.println("Chu vi hình chữ nhật là: "+rectangle.getPerimeter());
            System.out.println("Diện tích của hình chữ nhật là: "+rectangle.getArea());


        }
    }

