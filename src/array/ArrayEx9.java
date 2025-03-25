package array;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[][] multi = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                multi[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int[] arr : multi) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
