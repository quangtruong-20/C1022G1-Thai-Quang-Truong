package Day_4_ClassAndObject.Baitap;

import java.util.Scanner;

public class GiaiThuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int input = scanner.nextInt();

        int arr[] = new int[input];

        // số nguyên tố
//        int n = 2;
//        while (n<input){
//            int count1 = 0;
//            for (int i = 1; i <= n; i++) {
//                if (n % i == 0) {
//                    count1++;
//                }
//            }
//            if (count1 == 2) {
//                System.out.println(n + " ");
//            }
//            n++;
//        }
        // fibonanci
        int num1 = -1;
        int num2 = 1;
        int num3;
        for (int i = 0; i < input; i++) {
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            if (num3 < input ) {

//                System.out.println((num3 + " "));
                int count1 = 0;
            for (int j = 1; j <= input; j++) {
                if (num3 % j == 0) {
                    count1++;
                }
            }
            if (count1 == 2) {
                System.out.println(num3 + " ");
            }
            num3++;
            }
        }
    }
}
