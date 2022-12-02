package Day_1_Introduction_To_Java.thuchanh;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu rong: ");
        width = scanner.nextFloat();

        System.out.println("nhap chieu dai: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("dien tich hinh chu nhat là : " + area);



    }
}
