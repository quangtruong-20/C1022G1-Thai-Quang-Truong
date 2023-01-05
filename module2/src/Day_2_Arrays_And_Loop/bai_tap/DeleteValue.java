package Day_2_Arrays_And_Loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần xóa khỏi mảng: ");
        int x =Integer.parseInt(scanner.nextLine());

        for(int i = 0; i<arr.length;i++){
            if(x == arr[i]){
                for (int k = i; k < arr.length - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                arr[arr.length - 1] = 0;
            }
//
            }
        System.out.println(Arrays.toString(arr));
        }

    }

