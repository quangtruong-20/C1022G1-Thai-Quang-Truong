package Day_2_Arrays_And_Loop.Baitap;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n = 2;
        while (n<100){
            int count1 = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count1++;
                }
            }
            if (count1 == 2) {
                System.out.println(n + " ");
            }
            n++;
        }
    }
}
