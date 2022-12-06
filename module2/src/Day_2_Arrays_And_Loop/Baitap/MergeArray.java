package Day_2_Arrays_And_Loop.Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhập phần tử thứ [" + i + "] của mảng 1");
            int value = Integer.parseInt(scanner.nextLine());
            a[i] = value;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhập phần tử thứ [" + i + "] của mảng 2");
            int value = Integer.parseInt(scanner.nextLine());
            b[i] = value;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];

        }
        for (int i = 0; i < b.length; i++) {
            c[(a.length) + i] = b[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(Arrays.toString(c));
            break;
        }
    }
}

