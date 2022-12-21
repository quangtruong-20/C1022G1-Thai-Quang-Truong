package Day_13_ThuatToanSapXep.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        final int[] arr = { 45,23,12,65,87,9,23,5,8,1,90,88,666 };

        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;

            System.out.println("Mảng sau lần chèn thứ " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }
}






