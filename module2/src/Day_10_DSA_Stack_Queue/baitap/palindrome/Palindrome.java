package Day_10_DSA_Stack_Queue.baitap.palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        String stringWord = new String("Able was I ere I saw Elba") ;
        String[] n =stringWord.toLowerCase().split(" ");

        System.out.println(Arrays.toString(n));
        for (int i = 0; i < n.length ; i++) {
            queue.offer(n[i]);
            stack.push(n[i]);
        }

    }
}
