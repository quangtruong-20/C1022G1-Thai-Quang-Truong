package Day_1_Introduction_To_Java.bai_tap;



import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số cần đọc là");
        int number = scanner.nextInt();
        int units = (number % 100) % 10;
        int dozens = (number % 100) / 10;
        int hundreds = (number / 100);
        if (number >= 1000) {
            System.out.println("Bạn nhập quá 3 chữ số");
        } else if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("there");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("out of ability");
                    break;
            }
        } else if (number < 20) {
            switch (units) {
                case 0:
                    System.out.println("ten");
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
                default:
                    System.out.println("out of ability");
                    break;
            }
        } else if (number < 100) {
            switch (dozens) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
                default:
                    System.out.print("out of ability");
                    break;
            }
            switch (units) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("out of ability");
                    break;
            }
        }
//        else if (number < 1000) {
//            switch (hundreds) {
//                case 1:
//                    System.out.print("one hundreds ");
//                    break;
//                case 2:
//                    System.out.print("two hundreds ");
//                    break;
//                case 3:
//                    System.out.print("three hundreds ");
//                    break;
//                case 4:
//                    System.out.print("four hundreds ");
//                    break;
//                case 5:
//                    System.out.print("five hundreds ");
//                    break;
//                case 6:
//                    System.out.print("six hundreds ");
//                    break;
//                case 7:
//                    System.out.print("seven hundreds ");
//                    break;
//                case 8:
//                    System.out.print("eight hundreds ");
//                    break;
//                case 9:
//                    System.out.print("nine hundreds ");
//                    break;
//                default:
//                    System.out.print("out of ability hundreds");
//                    break;
//            }
//            switch (dozens) {
//                case 2:
//                    System.out.print("twenty ");
//                    break;
//                case 3:
//                    System.out.print("thirty ");
//                    break;
//                case 4:
//                    System.out.print("forty ");
//                    break;
//                case 5:
//                    System.out.print("fifty ");
//                    break;
//                case 6:
//                    System.out.print("sixty ");
//                    break;
//                case 7:
//                    System.out.print("seventy ");
//                    break;
//                case 8:
//                    System.out.print("eighty ");
//                    break;
//                case 9:
//                    System.out.print("ninety ");
//                    break;
//            }
//            switch (units) {
//                case 1:
//                    System.out.println("one");
//                    break;
//                case 2:
//                    System.out.println("two");
//                    break;
//                case 3:
//                    System.out.println("three");
//                    break;
//                case 4:
//                    System.out.println("four");
//                    break;
//                case 5:
//                    System.out.println("five");
//                    break;
//                case 6:
//                    System.out.println("six");
//                    break;
//                case 7:
//                    System.out.println("seven");
//                    break;
//                case 8:
//                    System.out.println("eight");
//                    break;
//                case 9:
//                    System.out.println("nine");
//                    break;
//            }
        }
    }
//}
