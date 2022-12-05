package Day_2_Arrays_And_Loop.Baitap;

import java.util.Scanner;

public class SoNguyenToDauTien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        int number = sc.nextInt();
        int count = 0;
        int N = 2;

        while (count < number) {
            int count1 = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    count1++;
                }
            }
            if (count1 == 2) {
                System.out.println(N + " ");
                count++;
            }
            N++;
        }

    }
}
