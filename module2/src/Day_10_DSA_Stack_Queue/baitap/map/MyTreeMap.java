package Day_10_DSA_Stack_Queue.baitap.map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<Object, Integer> myMap = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String n = scanner.nextLine().toLowerCase();

        for (int i = 0; i <n.length() ; i++) {
            if (myMap.containsKey(n.charAt(i)+"")){
                myMap.put(n.charAt(i)+"",myMap.get(n.charAt(i)+"")+1);
            }
            else {
                myMap.put(n.charAt(i)+"",1);
            }
        }
        for (Map.Entry<Object, Integer> entry : myMap.entrySet()
        ) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
