package Day_10_DSA_Stack_Queue.baitap.decimal;

import java.util.Scanner;
import java.util.Stack;

public class Decimal {
    public static void main(String[] args) {
        Stack<Integer> decimal = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số cần chuyển đổi: ");
        int n = Integer.parseInt( scanner.nextLine());
        while (n>0){
            decimal.push(n % 2);
            n=n/2;
        }
        for (int i = 0; i < decimal.size() ; i++) {
        System.out.print(decimal.pop());
        }
//        Stack<Integer> myStackArr = new Stack<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số bất kỳ: ");
//        int numbInput = Integer.parseInt(scanner.nextLine());
//        System.out.print("Nhị phân của "+numbInput+" là: ");
//        int surplus = 0;
//        while (numbInput > 0) {
//            surplus = numbInput % 2;
//            myStackArr.push(surplus);
//            numbInput = numbInput / 2;
//        }
//        int size = myStackArr.size();
//        for (int i = 0; i < size ; i++) {
//            System.out.print(myStackArr.pop());
    }
}
