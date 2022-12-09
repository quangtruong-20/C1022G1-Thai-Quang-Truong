package Day_1_Introduction_To_Java.bai_tap;

import java.util.Scanner;

public class SoDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số chia");
        int a = sc.nextInt();
        System.out.println("Nhập số bị chia");
        int b = sc.nextInt();
        System.out.println("a % b = " + (a % b));
    }
}
