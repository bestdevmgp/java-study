package array;

import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            arr[i][2] = 1;
        }

        for (int[] arr1 : arr) {
            System.out.println(Arrays.toString(arr1));
        }
    }
}
