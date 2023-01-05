package Day_2_Arrays_And_Loop.bai_tap;

import java.util.Scanner;

public class InputValue  {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chèn vào");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vị trí index cần chèn vào");
        int index = Integer.parseInt(scanner.nextLine());

        if (index <= -1 || index >= arr.length) {
            System.out.println("không thể thêm phần tử");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            for (int array : arr) {
                System.out.print(array + ",");
            }
        }
    }
}
