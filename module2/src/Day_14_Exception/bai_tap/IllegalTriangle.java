package Day_14_Exception.bai_tap;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập cạnh a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh c: ");
        int c = Integer.parseInt(scanner.nextLine());


        try {
            check(a,b,c);
            System.out.println("Đây là 3 cạnh của tam giác");
        }catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }

   public static void check(int a, int b, int c) throws IllegalTriangleException {

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("3 cạnh phải lớn hơn 0. ");
        }

        if (a + b <= c || a + c <= b || c + b <= a) {

            throw new IllegalTriangleException("Tổng của 2 cạnh phải lớn hơn cạnh còn lại. ");
        }

    }

    static class IllegalTriangleException extends Exception {
        public IllegalTriangleException(String message) {
            super(message);
        }
    }
}