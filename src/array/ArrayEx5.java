package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이를 입력하세요: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        int sum = 0;
        double avg;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println("합: " + sum);
        System.out.println("평균: " + avg);
    }
}
