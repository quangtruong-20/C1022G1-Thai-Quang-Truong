import java.util.Scanner;

public class GiaiThua {

    public static int giaiThua(int n){

        if (n == 0) return 1;
        else return n* giaiThua(n-1);

    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(factorial(n));


    }
}
