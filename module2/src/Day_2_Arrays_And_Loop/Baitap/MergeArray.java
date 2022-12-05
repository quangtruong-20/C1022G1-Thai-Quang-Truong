package Day_2_Arrays_And_Loop.Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    //    Bước 1: Tạo 2 mảng số với kích thước cho trước
//
//    Bước 2: Sử dụng vòng lặp nhập giá trị cho các phần tử trong mảng
//
//    Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
//
//    Bước 4: Sử dụng vòng lặp để duyệt các phần tử trong mảng 1. Lấy từng phần tử trong mảng 1 gán vào từng phần tử trong mảng thứ 3, tính từ phần tử đầu tiên.
//
//    Bước 5: Sử dụng vòng lặp để duyệt các phần tử trong mảng 2. Lấy từng phần tử trong mảng 2 gán vào phần tử tiếp theo của mảng 3, tính từ phần tử array3[array2.length]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhập phần tử thứ [" + i + "] của mảng 1");
            int value = Integer.parseInt(scanner.nextLine());
            a[i] = value;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhập phần tử thứ [" + i + "] của mảng 2");
            int value = Integer.parseInt(scanner.nextLine());
            b[i] = value;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

//        int fal = a.length;
//        int sal = b.length;
//        int[] result = new int[fal + sal];
//        System.arraycopy(a, 0, result, 0, fal);
//        System.arraycopy(b, 0, result, fal, sal);
//        System.out.println(Arrays.toString(result));

        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];

        }
        for (int i = 0; i < b.length; i++) {
            c[(a.length) + i] = b[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(Arrays.toString(c));
            break;
        }
    }
}

