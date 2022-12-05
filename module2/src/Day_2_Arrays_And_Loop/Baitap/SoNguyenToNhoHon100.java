package Day_2_Arrays_And_Loop.Baitap;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int N = 2;
        while (N<100){
            int count1 = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    count1++;
                }
            }
            if (count1 == 2) {
                System.out.println(N + " ");
            }
            N++;
        }
    }
}
