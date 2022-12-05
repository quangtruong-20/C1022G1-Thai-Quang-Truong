package Day_2_Arrays_And_Loop.Baitap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class FindMinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ [" + i + "]");
            int value = Integer.parseInt(scanner.nextLine());
            arr[i] = value;

        }
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {

            if (arr[j]<min) {
                min = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("số nhỏ nhất là "+min);
    }
}
