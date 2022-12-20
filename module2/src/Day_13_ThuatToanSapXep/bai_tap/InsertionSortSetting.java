package Day_13_ThuatToanSapXep.bai_tap;

import java.util.Arrays;

public class InsertionSortSetting {
  static   void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > currentElement) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
         int[] arr = {9,8,7,6,5,4,3,2,1,0};

       insertionSort(arr);
        System.out.println(Arrays.toString(arr));



    }



}

