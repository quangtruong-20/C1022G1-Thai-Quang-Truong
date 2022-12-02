package Day_1_Introduction_To_Java.baitap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner ten = new Scanner(System.in);
        System.out.println("nhap ten ban");
        String name = ten.nextLine();
        System.out.println("ten cua ban la " + name);
    }
}
