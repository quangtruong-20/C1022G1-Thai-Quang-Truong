package Day_10_DSA_Stack_Queue.baitap.ReverseArray;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayString {
    public static void main(String[] args) {
    Stack<String> wStack = new Stack<>();
    Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập từ ");
    String n = scanner.nextLine();

        for (int i = 0; i < n.length() ; i++) {
                wStack.push(n.charAt(i)+"");
        }
        System.out.println(wStack);

        for (int i = 0; i < n.length(); i++) {
            System.out.print(wStack.pop());
        }
    }


}
