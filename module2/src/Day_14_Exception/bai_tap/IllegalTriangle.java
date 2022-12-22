package Day_14_Exception.bai_tap;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) throws IllegalTriangleException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập cạnh a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh c: ");
        int c = Integer.parseInt(scanner.nextLine());

        check(a,b,b);

    }

   public static void check(int a, int b, int c)  {

       try {

           if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
               System.out.println("Đây là 3 cạnh của tam giác ");
           } else {
               throw new IllegalTriangleException();
           }


       } catch (IllegalTriangleException e ){
           System.out.println("Đây không phải là 3 cạnh của tam giác");
       }

       finally {
           System.out.println("Kết thúc chương trình");
       }
   }
}