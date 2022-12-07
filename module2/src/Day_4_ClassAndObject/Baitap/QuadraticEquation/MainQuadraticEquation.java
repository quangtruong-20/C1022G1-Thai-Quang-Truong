package Day_4_ClassAndObject.Baitap.QuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        System.out.println("Delta = " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.print("r1 = " + quadraticEquation.getRoot1());
            System.out.println(" ,r2 = " + quadraticEquation.getRoot2());

        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("r = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}


