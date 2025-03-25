package array;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[][] info = {{85, 70, 90, 95}, {80, 95, 90, 75}, {75, 85, 90, 80}};
        int[] arr = new int[4];
        double sum = 0;

        for (int i = 0; i < info.length; i++) {
            for (int j = 0; j < info[i].length; j++) {
                sum += info[i][j];
                arr[j] = info[i][j];
            }
            System.out.print("학생 " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.print("| 평균: " + (sum / 4) + "\n");
            sum = 0;
        }

    }
}
