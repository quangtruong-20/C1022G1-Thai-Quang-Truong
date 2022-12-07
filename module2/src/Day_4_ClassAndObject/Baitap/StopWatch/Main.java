package Day_4_ClassAndObject.Baitap.StopWatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to start Time");
        int a = scanner.nextInt();
        StopWatch stopWatch = new StopWatch();

        if (a==1){
            stopWatch.getStartTime();
        }
        System.out.println("Enter 2 to End Time.");
        int b = scanner.nextInt();
        if (b == 2) {

            stopWatch.getEndTime();
            System.out.println("ElapsedTime: "+ stopWatch.getElapsedTime() + " milisecond");
        }
        System.out.println("Enter 3 to reset Time");
        int c = scanner.nextInt();
        if (c==3){
            stopWatch.start();
            stopWatch.stop();
        }
    }
}
