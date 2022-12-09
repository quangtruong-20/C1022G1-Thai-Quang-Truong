package Day_1_Introduction_To_Java.bai_tap;

import java.util.Scanner;

public class Convert_Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số USD bạn muốn quy đổi: ");
        int money = scanner.nextInt();
        int swap = money * 24000;

        System.out.println("= " + swap + "VNĐ");
    }
}
