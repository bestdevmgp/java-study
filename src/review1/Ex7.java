package review1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int start, end;
        if (a <= b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = start; j <= end; j++) {
                System.out.printf(j + " * " + i + " = " + j * i + "   ");

            }
            System.out.println();  // 줄바꿈
        }
    }
}
