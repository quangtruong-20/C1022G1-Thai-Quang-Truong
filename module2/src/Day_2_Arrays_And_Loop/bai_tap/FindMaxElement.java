package Day_2_Arrays_And_Loop.bai_tap;

public class FindMaxElement {
    public static void main(String[] args) {
        double[][] arr = {{1, 2, 3, 4, 5, 6, 7},
                          {11, 12, 14, 15, 62, 74}};
        double max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (max < arr[row][column]) {
                    max = arr[row][column];
                }
            }
        }
        System.out.println(max);

    }
}