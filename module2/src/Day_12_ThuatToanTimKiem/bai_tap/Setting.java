package Day_12_ThuatToanTimKiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Setting {
    static int[] array = new int[5];
    int binarySearch(int[] array, int left, int right, int value) {
        while (right > left) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (value > array[mid]) {
                left = mid + 1;
            } else if (value < array[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Setting setting = new Setting();



        int index = setting.binarySearch(array,0,array.length-1,5);

        if (index != -1) {
            System.out.println("phần tử 5 nằm vị trí: " + index);
        } else {
            System.out.println("Không tìm thấy phần tử trong mảng");
        }

    }

}