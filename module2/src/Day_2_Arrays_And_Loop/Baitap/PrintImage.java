package Day_2_Arrays_And_Loop.Baitap;

import java.util.Scanner;

public class PrintImage {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while(choice != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0;i<3;i++){
                        for(int j =0;j<7;j++){
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;

                case 2:
                    System.out.println("Print the square triangle");
                    System.out.println("Print the square triangle1");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Print the square triangle2");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Print the square triangle3");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Print the square triangle4");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 6; k > i; k--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 10; j > i; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= i * 2 - 1; k++) {
                            System.out.print(" *");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
