package input;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int sum = n1 + n2 + n3;
        int avg = sum / 3;

        System.out.println("합: " + sum);
        System.out.println("평균: " + avg);
    }
}
