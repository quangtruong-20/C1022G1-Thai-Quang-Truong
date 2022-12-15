package Day_10_DSA_Stack_Queue.baitap.decimal;

import java.util.Scanner;
import java.util.Stack;

public class Decimal {
    public static void main(String[] args) {
        Stack<Integer> decimal = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số cần chuyển đổi: ");
        int n = Integer.parseInt(scanner.nextLine());
        while (n > 0) {
            decimal.push(n % 2);
            n = n / 2;
        }
        for (int i = 0; i < decimal.size(); i++) {
            System.out.print(decimal.pop());
        }

    }
}
