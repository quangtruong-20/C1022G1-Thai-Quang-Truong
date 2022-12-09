package Day_2_Arrays_And_Loop.bai_tap;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        double[][] ar = {{1, 2, 3, 4, 5, 76, 7, 8},
                {12, 32, 41, 52, 646, 85, 86, 97}};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bạn muốn tính tổng cột số mấy ?");
        int input = Integer.parseInt(scanner.nextLine());

        for (int column = 0; column < ar[0].length; column++) {
            int total = 0;
            for (int row = 0; row < ar.length; row++) {
                total += ar[row][column];

            }
            if (input == column) {
                System.out.println("Sum for column " + column + " is "
                        + total);
            }
        }


    }
}

