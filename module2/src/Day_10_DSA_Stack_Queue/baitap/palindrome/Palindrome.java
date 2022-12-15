package Day_10_DSA_Stack_Queue.baitap.palindrome;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        String stringWord = "Able was I ere I saw Elba";
        String[] n = stringWord.toLowerCase().split(" ");

        System.out.println(Arrays.toString(n));
        for (int i = 0; i < n.length; i++) {
            queue.offer(n[i]);
            stack.push(n[i]);
        }
        boolean flag = true;
        for (int i = 0; i < n.length; i++) {
            queue.poll();
            stack.pop();

            flag = queue.equals(stack);
        }

        if (flag) {
            System.out.println("đây là chuỗi palidrome");
        } else {
            System.out.println("không phải là chuỗi palidrome");
        }


    }
}
