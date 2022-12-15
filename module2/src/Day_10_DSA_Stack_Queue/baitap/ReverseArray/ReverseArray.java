package Day_10_DSA_Stack_Queue.baitap.ReverseArray;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        int z;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            z = scanner.nextInt();
            a.push(z);
        }
        System.out.println(a);

        for (int i = 0; i < n; i++) {
            System.out.print(a.pop());
        }


    }
}
