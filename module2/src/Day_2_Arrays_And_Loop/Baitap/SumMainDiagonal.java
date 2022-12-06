package Day_2_Arrays_And_Loop.Baitap;

import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args) {
        int i, j;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int length = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[length][length];

        for (i = 0; i < length; i++) {
            for (j = 0; j < length; j++) {
                System.out.println("array [ " + i + " ]" + "[ " + j + " ]");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
                if (i == j) {
                    sum += arr[i][j];


                }
            }
        }
        System.out.println("Tổng các số của đường chéo trính trong ma trận là : " + sum);
    }
}
